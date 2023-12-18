import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];
        for (int i=0; i<3; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        boolean ans = solve(a, b);

        System.out.println(ans ? "YES" : "NO");
    }

    private static boolean solve(int[] a, int[] b) {
        int[] count = new int[4];
        for (int i=0; i<3; i++) {
            count[a[i]-1]++;
            count[b[i]-1]++;
        }

        for (int i=0; i<4; i++) {
            if (count[i] > 2) return false;
        }

        return true;
    }
}
