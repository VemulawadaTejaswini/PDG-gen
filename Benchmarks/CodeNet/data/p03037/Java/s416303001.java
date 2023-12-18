import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] card = new int[M+1][3];

            for(int i = 1 ; i <= M ; i++){
                card[i][1] = sc.nextInt();
                card[i][2] = sc.nextInt();
            }
        sc.close();

        int min = 100000;
        int max = 1;
        for(int i = 1 ; i <= M ; i++){
            max = Math.max(max,card[i][1]);
            min = Math.min(min,card[i][2]);
        }

        int ans = Math.max(min-max+1,0);
        System.out.println(ans);

   }
}
