import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum = sum + A[i];
        }
        Arrays.sort(A);
        if((double)A[N-M] < (double)(sum/(4*M))){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
    }
} 