import java.util.Scanner;

public class Main {
    static int[] c;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        long ret = 0;
        int tmp = 0;
        int rgt =0;
        for (int lft = 0; lft < n; lft++) {
            while (rgt < n && tmp + a[rgt] == (tmp ^ a[rgt])) {
                tmp += a[rgt];
                rgt++;
            }
            ret += rgt - lft;
            if(lft == rgt) {
                rgt++;
            }
            tmp -= a[lft];
        }
        System.out.println(ret);
    }
}