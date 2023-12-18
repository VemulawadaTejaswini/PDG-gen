import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            B[i] = A[i] - i - 1;
        }
        sc.close();
        Arrays.sort(B);
        int b = B[N/2];
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += Math.abs(B[i] - b);
        }
        System.out.println(sum);
    }
}