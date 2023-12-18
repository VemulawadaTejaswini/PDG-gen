import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        long [] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextLong();
        }
        long count = 0L;
        for (int i = 0; i < n - 1; i++) {
            long summary = a[i];
            for (int j = i + 1; j < n; j++) {
                summary += a[j];
                if (summary == 0L) count++;
            }
        }
        System.out.println(count);
    }
}
