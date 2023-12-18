import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] m = new int[n];

        int min = Integer.MAX_VALUE;
        int sum = 0;
        int ans = n;

        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            sum += m[i];
            if (min > m[i]) {
                min = m[i];
            }
        }
        sc.close();

        k -= sum;

        System.out.println(ans + k / min);
    }
}