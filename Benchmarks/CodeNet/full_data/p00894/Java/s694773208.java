import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        while (true) {
            int N = in.nextInt();
            if (N == 0) break;
            
            Vector<Person> persons = new Vector<Person>();
            
            while (N-- > 0) {
                String str = in.next();
                int M = Integer.parseInt(str.substring(0, 2), 10);
                int D = Integer.parseInt(str.substring(3, 5), 10);
                
                str = in.next();
                int h = Integer.parseInt(str.substring(0, 2), 10);
                int m = Integer.parseInt(str.substring(3, 5), 10);
                
                char c = in.next().charAt(0);
                int n = Integer.parseInt(in.next(), 10);
                
                while (persons.size() < n + 1) {
                    persons.add(new Person());
                }
                
                Person p = persons.get(n);
                if (c == 'I') {
                    p.records.add(new Record(M, D, h, m));    
                } else {
                    p.exit(M, D, h, m);
                }
            }
            
            int maximum = -999;
            Vector<Record> basis = persons.get(0).records;
            for (int i = 1; i < persons.size(); i++) {
                maximum = Math.max(maximum, persons.get(i).getScore(basis));
            }
            
            System.out.println(maximum);
            
            // for (int i = 0; i < persons.size(); i++) {
            //     System.out.println(i + ":");
            //     System.out.println(persons.get(i));
            // }
        }
    }
    
    public static class Person {
        Vector<Record> records;
        
        public Person() {
            records = new Vector<Record>();
        }
        
        public void exit(int M, int D, int h, int m) {
            for (Record rec : records) {
                rec.exit(M, D, h, m);
            }
        }
        
        public int getScore(Vector<Record> basis) {
            int score = 0;
            for (Record rec : records) {
                for (Record other : basis) {
                    score += rec.overlap(other);
                }
            }
            return score;
        }
        
        public String toString() {
            String str = "";
            for (Record rec : records) {
                str += rec.toString() + "\n";
            }
            return str;
        }
    }
    
    public static class Record {
        int M;
        int D;
        int start;
        int end;
        boolean isDone;
        
        public Record(int M, int D, int h, int m) {
            this.M = M;
            this.D = D;
            this.start = h * 60 + m;
            this.end = 24 * 60;
            this.isDone = false;
        }
        
        public void exit(int M, int D, int h, int m) {
            if (this.isDone) return;
            this.isDone = true;
            if (this.M == M && this.D == D) {
                this.end = h * 60 + m;
            }
        }
        
        public int overlap(Record other) {
            if (M != other.M || D != other.D) return 0;
            int adjStart = Math.max(start, other.start);
            int adjEnd = Math.min(end, other.end);
            if (adjEnd < adjStart) return 0;
            return adjEnd - adjStart;
        }
        
        public String toString() {
            return String.format("  [%02d/%02d] %02d:%02d - %02d:%02d", M, D, 
                start / 60, start % 60, end / 60, end % 60);
        }
    }
}

