import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), k = in.nextLong();
        int[] a = new int[(int) n + 1];
        int[] vis = new int[(int) n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        int m = 1, j = 1;
        while (vis[m] == 0) {
            vis[m] = j++;
            m = a[m];
        }
        long b = (k - vis[m] + 1) % (j - vis[m]);
        for (int i = 0; i < b; i++) {
            m = a[m];
        }
        System.out.println(m);
    }

}
