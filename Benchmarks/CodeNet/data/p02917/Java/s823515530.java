import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] B;


        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();

            B = new long[N-1];

            for(int i = 0;i < N-1;i++){
                B[i] = sc.nextLong();
            }

        }
        long result = 0;
        long[] A =new long[N];
        A[N-1] = B[N-2];
        for(int i = N-2;i > 0;i--){
            A[i] = Math.min(B[i],B[i-1]);
        }
        A[0] = B[0];
        for(int i = 0;i < N;i++){
            result += A[i];
        }

        System.out.println(result);
    }

}
