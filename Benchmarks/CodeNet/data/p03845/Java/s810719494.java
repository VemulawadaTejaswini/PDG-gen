import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T[] = new int[N];
        int sum = 0;
        int U[] = new int[N];
       for(int i=0;i<N;i++){
           T[i] = sc.nextInt();
       }
       int M = sc.nextInt();
       int P[][] = new int[M][2];
       for(int i=0;i<M;i++){
           P[i][0] = sc.nextInt();
           P[i][1] = sc.nextInt();
       }
       for(int i =0;i<M;i++){
        for(int k=0;k<N;k++){
           U[k] = T[k];
        }
        sum = 0;
        int k1 = P[i][0] ;
        U[k1-1] = P[i][1]; 
        for(int j=0;j<N;j++){
            sum = sum + U[j];
        }
           System.out.println(sum);

        }
    } 
}