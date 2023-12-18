import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Map<Integer,Integer> numCanPass = new HashMap<>();
        for(int i=1; i<=N; i++){
            numCanPass.put(i, 0);
        }
        int minCard = 1;
        int maxCard = N;
        for(int i=0; i<M; i++){
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            
            minCard = Math.max(minCard,L);
            maxCard = Math.min(maxCard,R);
        }
        if(minCard>maxCard){
            System.out.println(String.valueOf(0));
        }else{
            System.out.println(String.valueOf(maxCard - minCard + 1));
        }
    }
}