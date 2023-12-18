import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        q_2();
    }

    private static void q_1() {
        try(Scanner scan = new Scanner(System.in)) {
            int H = scan.nextInt();
            int W = scan.nextInt();
            int h = scan.nextInt();
            int w = scan.nextInt();

            int result = (H * W) - ((W * h) - (h * w) + (H * w));

            System.out.println(result);
        }
    }

    private static void q_2() {
        try(Scanner scan = new Scanner(System.in)) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int C = scan.nextInt();

            int[] B = IntStream.range(0, M).map(i -> scan.nextInt()).toArray();
            int[][] A = new int[N][M];

            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    A[i][j] = scan.nextInt();
                }
            }

            int cnt = 0;
            int result;
            for(int i=0; i<N; i++) {
                result = 0;
                for(int j=0; j<M; j++) {
                    result += B[j] * A[i][j];
                }
                result += C;

                if(result > 0) {
                    cnt ++;
                }
            }

            System.out.println(cnt);

        }
    }
}