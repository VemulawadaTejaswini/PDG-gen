import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            a[i] = temp;
        }
        long ans1 = 0;
        long ans2 = 0;
        long temp = 0;
        for (int i = 0; i < n; i++) {
            long num = a[i];
            if (i % 2 == 0 && temp + num >= 0) {
                ans1 += temp + num + 1;
                num -= temp + num + 1;
            }
            if (i % 2 != 0 && temp + num <= 0) {
                ans1 += Math.abs(temp + num - 1);
                num += Math.abs(temp + num - 1);
            }
            temp += num;
        }
        temp = 0;
        for (int i = 0; i < n; i++) {
            long num = a[i];
            if (i % 2 == 0 && temp + num <= 0) {
                ans2 += Math.abs(temp + num - 1);
                num += Math.abs(temp + num - 1);
            }
            if (i % 2 != 0 && temp + num >= 0) {
                ans2 += temp + num + 1;
                num -= temp + num + 1;
            }
            temp += num;
        }
        System.out.println(Math.min(ans1, ans2));
    }
}