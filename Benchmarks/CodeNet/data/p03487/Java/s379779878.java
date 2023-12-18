import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();

        int[] count = new int[1100000000];

        for (int i = 0; i < 1100000000; i++)
            count[i] = 0;

        for (int i = 0; i < n; i++)
            count[a[i]]++;

        int cnt = 0;

        for (int i = 0; i <= 1000000000; i++) {
            if (count[i] != 0 && count[i] != i) {
                if (count[i] > i) {
                    cnt += count[i] - i;
                } else {
                    cnt += count[i];
                }
            }
        }
        System.out.println(cnt);
    }
}