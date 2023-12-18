import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Stat> minus = new PriorityQueue<>(Comparator.comparingLong(p->-p.min));
        long nowtot = 0;
        for(int i=0;i<N;i++){
            String S = sc.next();
            Stat n = new Stat(S);
            if(n.min < 0){
                minus.add(n);
            }else{
                nowtot += n.tot;
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
