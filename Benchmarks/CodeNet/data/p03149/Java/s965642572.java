import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[4];
        N[0] = sc.nextInt();
        N[1] = sc.nextInt();
        N[2] = sc.nextInt();
        N[3] = sc.nextInt();

        boolean ans = solve(N);

        System.out.println(ans ? "YES" : "NO");
    }

    private static boolean solve(int[] N) {
        Arrays.sort(N);

        if (N[0] == 1 && N[1] == 4 && N[2] == 7 && N[3] == 9) {
            return true;
        }

        return false;
    }

}
