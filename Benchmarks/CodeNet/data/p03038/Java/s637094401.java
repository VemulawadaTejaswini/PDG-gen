import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] card = new int[N+1];

            for(int i = 1 ; i <= N ; i++){
                card[i] = sc.nextInt();
            }

            int[][] J = new int[M+1][3];

            for(int i = 1 ; i <= M ; i++){
                J[i][1] = sc.nextInt();
                J[i][2] = sc.nextInt();
            }

        sc.close();
        Queue<Integer> queue = new PriorityQueue<Integer>();

        for(int i = 1 ; i <= N ; i++){
            queue.add(card[i]);
        }

        for(int i = 1 ; i <= M ; i++){
            for(int j = 1 ; j <= J[i][1] ; j++){
                int p = queue.poll();
                if(p <= J[i][2]){
                    queue.add(J[i][2]);
                }
                else{
                    queue.add(p);
                }
            }
        }

        long ans = 0;
        for(int i = 1 ; i <= N ; i++){
            ans += queue.poll();
        }
        System.out.println(ans);



   }
}