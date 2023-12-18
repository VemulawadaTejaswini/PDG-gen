import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int minB = Integer.MAX_VALUE;
        int maxA = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            maxA = Math.min(maxA, a[i]);
            minB = Math.max(minB, b[i]);
        }

        System.out.println(maxA + minB);


    }

}
