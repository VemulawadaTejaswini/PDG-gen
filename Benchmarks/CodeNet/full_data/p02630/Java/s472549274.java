import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] num = new int[100000];
        long sum = 0;
        for (int i = 0 ;i < n; i++) {
            int a = sc.nextInt();
            sum += a;
            num[a]++;
        }

        int q = sc.nextInt();
        for (int i = 0 ;i < q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            int diff = c - b;
            sum += diff * num[b];
            num[c] += num[b];
            num[b] = 0;

            System.out.println(sum);
        }
    }
}
