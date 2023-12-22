import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // int TC = Integer.parseInt(sc.next(), 10);
        
        while (true) {
            int PC = sc.nextInt();
            int S = sc.nextInt();
            if (PC == 0 && S == 0) break;
            
            Student[] students = new Student[S];
            for (int i = 0; i < S; i++) {
                students[i] = new Student();
            }
            
            int R = sc.nextInt();
            for (int i = 0; i < R; i++) {
                int t = sc.nextInt();
                int pc = sc.nextInt();
                int stud = sc.nextInt() - 1;
                int s = sc.nextInt();
                
                if (s == 1) {
                    students[stud].startUsage(t, pc);
                } else {
                    students[stud].endUsage(t, pc);
                }
            }
            
            int Q = sc.nextInt();
            for (int i = 0; i < Q; i++) {
                int t1 = sc.nextInt();
                int t2 = sc.nextInt();
                int stud = sc.nextInt() - 1;
                int total = students[stud].getRentalTime(t1, t2);
                
                System.out.println(total);
            }
        }
    }
    
    public static class Student {
        Vector<Record> records;
        boolean[] table;
        
        public Student() {
            records = new Vector<Record>();
            table = new boolean[1261];
        }
        
        public void startUsage(int t, int pc) {
            records.add(new Record(t, pc));
        }
        
        public void endUsage(int t, int pc) {
            for (int i = records.size() - 1; i >= 0; i--) {
                Record r = records.get(i);
                if (r.ongoing && r.pc == pc) {
                    r.ongoing = false;
                    r.end = t;
                    break;
                }
            }
        }
        
        public int getRentalTime(int s, int e) {
            if (!table[0]) {
                table[0] = true;
                for (Record rec : records) {
                    Arrays.fill(table, rec.start, rec.end, true);
                }
            }
            
            int total = 0;
            while (s < e) {
                if (table[s]) total++;
                s++;
            }
            
            return total;
        }
    }
    
    public static class Record {
        int start;
        int end;
        int pc;
        boolean ongoing;
        
        public Record(int t, int pc) {
            ongoing = true;
            start = t;
            this.pc = pc;
        }
    }
    
}


