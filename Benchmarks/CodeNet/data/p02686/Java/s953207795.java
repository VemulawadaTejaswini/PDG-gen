import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Stat> minus = new PriorityQueue<>(
                new Comparator<Stat>() {
            @Override
            public int compare(Stat o1, Stat o2) {
                if(o1.min == o2.min){
                    if(o1.min < o2.min){
                        return -1;
                    }else if(o1.min > o2.min){
                        return 1;
                    }else{
                        return 0;
                    }
                }else{
                    if(o1.tot < o2.tot){
                        return 1;
                    }else if(o1.tot > o2.tot){
                        return -1;
                    }else{
                        return 0;
                    }
                }
            }
        });
        PriorityQueue < Stat > minus_totalPlus = new PriorityQueue<>(Comparator.comparingLong(p -> -p.min));
        long nowtot = 0;
        for(int i=0;i<N;i++){
            String S = sc.next();
            Stat n = new Stat(S);
            if(n.min < 0){
                if(n.tot >= 0){
                    minus_totalPlus.add(n);
                }else {
                    minus.add(n);
                }
            }else{
                nowtot += n.tot;
            }
        }
        while(!minus_totalPlus.isEmpty()){
            Stat s = minus_totalPlus.poll();
            if(nowtot+s.min <0){
                System.out.println("No");
                return;
            }else{
                nowtot += s.tot;
            }
        }

        while(!minus.isEmpty()){
            Stat s = minus.poll();
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
