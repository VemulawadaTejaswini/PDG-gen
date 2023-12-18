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

        Arrays.sort(card);

        for(int i = 1 ; i <= M ; i++){
            for(int j = 1 ; j <= J[i][1] ; j++){
                if(card[j] < J[i][2]){
                    card[j] = J[i][2];
                }
            /*
                for(int p = 1 ; p <= N ; p++){
                    System.out.print(card[p] + " ");
                }
                
                System.out.println("");
            */
            }
            Arrays.sort(card);
        }
        long ans = 0;
        for(int i = 1 ; i <= N ; i++){
            ans += card[i];
        }
        System.out.println(ans);


   }
}
