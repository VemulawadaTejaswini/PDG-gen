import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long count = 0;
        long aCount = 0;

        if (N < A) {
            System.out.println(N);
        } else {
            while (count < N) {
                count += A;
                if (count <= N) {
                    aCount += A;
                } else {
                    aCount += count - N;
                }
                count += B;
            }
        }
        System.out.println(aCount);
    }
}