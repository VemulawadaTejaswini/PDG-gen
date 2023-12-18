import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        long sum = 0;
        for(int i = 0; i < N; i++){
            if(A[i]/2 > 0){
                sum += A[i]/2;
                A[i] %= 2;
            }
            if(i != N-1){
                if(A[i] > 0 && A[i+1] > 0){
                    int min = Math.min(A[i], A[i+1]);
                    sum += min;
                    A[i] -= min;
                    A[i+1] -= min;
                }
            }
        }

        System.out.println(sum);
    }
}