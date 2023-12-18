import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] nums = new int[n];
        int[] acc = new int[n];
        for (int i = 0; i < n; ++i) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            nums[i] = a;
            if (i == 0) {
                acc[i] = b;
            } else {
                acc[i] = acc[i - 1] + b;
            }
        }
        int i = search(k, acc);
        System.out.println(nums[i]);
    }

    public static int search(int k, int[] acc) {
        int l = 0;
        int h = acc.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            int a = acc[m];
            if (k > a) {
                l++;
            } else if (k < a) {
                h--;
            } else {
                return m;
            }
        }
        return l;
    }
}