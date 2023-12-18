import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0 ; i < n ; i++) {
            t[i] = sc.nextInt();
        }
        long x = 0;
        for (int i = 0 ; i < n - 1 ; i++) {
            x += Math.min((long) T, (long) (t[i + 1] - t [i]));
        }
        x += (long) T;
        System.out.println(x);
    }

}