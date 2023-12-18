import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Stat> minus_totPl = new PriorityQueue<>(Comparator.comparing(Stat::getMin).reversed().thenComparing(Stat::getTot).reversed());
        PriorityQueue<Stat> minus_totMin = new PriorityQueue<>(Comparator.comparing(Stat::getMin).reversed().thenComparing(Stat::getTot).reversed());
        long nowtot = 0;
        for(int i=0;i<N;i++){
            String S = sc.next();
            Stat n = new Stat(S);
            if(n.min < 0){
                if(n.tot >= 0){
                    minus_totPl.add(n);
                }else {
                    minus_totMin.add(n);
                }
            }else{
                nowtot += n.tot;
            }
        }
        while(!minus_totPl.isEmpty()){
            Stat s = minus_totPl.poll();
            if(nowtot+s.min <0){
                System.out.println("No");
                return;
            }else{
                nowtot += s.tot;
            }
        }

        while(!minus_totMin.isEmpty()){
            Stat s = minus_totMin.poll();
            if(nowtot+s.min <0){
                System.out.println("No");
                return;
            }else{
                nowtot += s.tot;
            }
        }
        if(nowtot == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    private static class Stat{
        long min;
        long tot;
        public Long getMin(){
            return min;
        }
        public Long getTot(){
            return tot;
        }
        public Stat(String S){
            min=0;
            tot=0;
            long now=0;
            for(char c:S.toCharArray()){
                if(c == '('){
                    now++;
                }
                if(c == ')'){
                    now--;
                    min = Math.min(min, now);
                }
            }
            tot = now;
        }
        @Override
        public String toString(){
            return min + " " + tot;
        }
    }
}
