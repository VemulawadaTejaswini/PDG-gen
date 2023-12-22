import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long[] A = new long[N];
        for(int i = 0; i < A.length; i++) {
            A[i] = scanner.nextLong();
        }
        long tmp = A[0];
        for(int i = 1; i < K; i++ ) {
            tmp *= A[i];
        }

        for(int i = K - 1; i < N-1; i++) {
            long tmp2 = tmp / A[i - (K - 1)] * A[i+1];
            if(tmp < tmp2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }


    }
}