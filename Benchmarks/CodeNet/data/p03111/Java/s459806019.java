import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[3];

        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();

        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        int res = Integer.MAX_VALUE;
        OUTER: for (int i = 0; i < (1 << (2 * n)); i++) {

            int[] len = new int[4];
            int[] num = new int[4];

            for (int j = 0; j < n; j++) {
                int ind = (i >> (2 * j)) % 4;
                len[ind] += l[j];
                num[ind]++;
            }

            int mp = 0;
            for (int j = 0; j < 3; j++) {
                if(num[j] == 0) continue OUTER;
                mp += (num[j] - 1) * 10;
                mp += Math.abs(a[j] - len[j]);
            }
            res = Math.min(res, mp);

        }
        System.out.println(res);

    }

}