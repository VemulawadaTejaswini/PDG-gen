import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] x = new int[N];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }
        sc.close();

        long sum = 0;

        for(int i = 0; i < N-1; i++){
            if((x[i+1]-x[i])*A < B){
                sum += (long)(x[i+1]-x[i])*(long)A;
            } else
                sum += B;
        }

        System.out.println(sum);
    }
}