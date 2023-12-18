import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] A = new int[N];
        int odds = 1;
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();

            if (A[i] % 2 == 1) {
                odds *= 1;
            } else {
                odds *= 2;
            }
        }
//        System.out.println("odds = " + odds);
        System.out.println((long) Math.pow(3, N) - odds);
    }
}
