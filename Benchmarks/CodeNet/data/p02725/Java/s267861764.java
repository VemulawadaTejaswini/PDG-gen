import java.util.Scanner;

public class Main {
    static char[] c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
//        int[] a = new int[n];
        long sum = 0;
        int start = sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            int d = sc.nextInt();
            sum += Math.min(d - start, k - d);
        }
        System.out.println(sum);
    }
}