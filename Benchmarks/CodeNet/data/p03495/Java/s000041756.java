import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int[] B = new int[N+1];
        int x = 0;
        for(int i = 0; i < N; i++){
            B[A[i]]++; 
        }
        Arrays.sort(B);
        for(int i = N; i >= N - K + 1; i--){
            x += B[i];
        }

        System.out.println(N - x);
    }
}