import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long k = scan.nextLong();
        int[] a = new int[n];
        int[] b = new int[n];
        int x = Math.abs(1-9);
        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        int[] buget = new int[114514];
        Arrays.fill(buget, 0);
        for(int i = 0; i < n; i++) {
            buget[a[i]] += b[i];
        }
        int num = 0;
        for(int i = 0; i < 114514; i++) {
            num += buget[i];
            if (num >= k) {
                System.out.println(i);
                return;
            }
        }
    }
}