
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] L = new int[N*2];
        for (int i=0; i<N*2; i++) {
            L[i] = sc.nextInt();
        }


        System.out.println(solve(N, L));
    }

    private static int solve(int N, int[] L) {
        int sum = 0;

        Arrays.sort(L);

        for (int i=0; i<L.length; i+=2) {
            sum += L[i];
        }

        return sum;
    }
}
