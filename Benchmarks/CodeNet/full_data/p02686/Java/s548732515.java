import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Stat> minus = new PriorityQueue<>(Comparator.comparingLong(p -> -p.min));
        PriorityQueue<RevStat> revminus = new PriorityQueue<>(Comparator.comparingLong(p -> -p.min));
        long nowtot = 0;
        long nowtotRev = 0;
        for (int i = 0; i < N; i++) {
            String S = sc.next();
            Stat n = new Stat(S);
            RevStat rn = new RevStat(S);
            if (n.min < 0) {
                minus.add(n);
            } else {
                nowtot += n.tot;
            }
            if(rn.min < 0){
                revminus.add(rn);
            }else{
                nowtotRev += rn.tot;
            }
        }
        while (!minus.isEmpty()) {
            Stat s = minus.poll();
            if (nowtot + s.min < 0) {
                System.out.println("No");
                return;
            } else {
                nowtot += s.tot;
            }
        }
        while(!revminus.isEmpty()){
            RevStat s = revminus.poll();
            if(nowtotRev + s.min < 0){
                System.out.println("No");
                return;
            }else{
                nowtotRev += s.tot;
            }
        }
        if (nowtot == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    private static class RevStat {
        long min;
        long tot;
        public RevStat(String S){
            min = 0;
            tot = 0;
            long now = 0;
            char[] cs = S.toCharArray();
            for(int i=cs.length-1;i>=0;i--){
                if(cs[i] == ')'){
                    now++;
                }else{
                    now--;
                    min = Math.min(min, now);
                }
            }
            tot = now;
        }
        @Override
        public String toString() {
            return min + " " + tot;
        }
    }

    private static class Stat {
        long min;
        long tot;

        public Stat(String S) {
            min = 0;
            tot = 0;
            long now = 0;
            for (char c : S.toCharArray()) {
                if (c == '(') {
                    now++;
                }
                if (c == ')') {
                    now--;
                    min = Math.min(min, now);
                }
            }
            tot = now;
        }

        @Override
        public String toString() {
            return min + " " + tot;
        }
    }
}
