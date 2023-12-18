
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0 ; i< N ; i++) {
            H[i] = sc.nextInt();
        }
        int index = 0;
        double minDiff = 10000;
        for (int i = 0 ; i < N ; i++) {
            double diff = Math.abs(T - 0.006 * H[i] - A);
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }
        }
        System.out.println(index + 1);
    }

}