import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        long total = 0;
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < i+2; j++){
                if(A[i] == A[j] || A[i] < A[j]){
                    continue;
                }
                if(A[i] > A[j]){
                    total += A[i] - A[j];
                    A[j] = A[i];
                }
            }
        }
        System.out.println(total);
    }
}
