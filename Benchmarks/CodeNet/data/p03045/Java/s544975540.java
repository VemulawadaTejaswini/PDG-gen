import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[][] A = new int[N][3];
            
            for(int i = 0 ; i < M ; i++){
                A[i][0] = sc.nextInt();
                A[i][1] = sc.nextInt();
                A[i][2] = sc.nextInt();
            } 

        sc.close();
        
        int[] ans = new int[N];

        int count = 1;

        boolean flag = false;
        int start = 0;
        while(!flag){
            count++;
            for(int i = start ;i < N ; i++){
 
               // System.out.println(count);
                int p = A[i][0];
                ans[p] = 1;

                if(p == A[i][0]){
                    ans[A[i][0]] = 1;
                }
                if(p == A[i][1]){
                    ans[A[i][1]] = 1;
                }
            }
            for(int i = 0 ; i < N ; i++){
                if(ans[i] == 0){
                    start = i;
                  //  System.out.println("start : " +start);
                    break;
                }
                flag = true;
            }
        }
        System.out.println(count);
    }
}
