import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        int hw = h * w;
        int[] x = new int[hw + 1];
        int[] y = new int[hw + 1];
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                int a = sc.nextInt();
                x[a] = i;
                y[a] = j;
            }
        }
        int q = sc.nextInt();
        for(int i=0; i<q; i++) {
            long res = 0;
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (l == r) {
                System.out.println(res);
                continue;
            }
            int px = x[l];
            int py = y[l];
            for (int j = l + d; j <= r; j += d) {
                res += Math.abs(px - x[j]) + Math.abs(py - y[j]);
                px = x[j];
                py = y[j];
            }
            System.out.println(res);
        }

    }

}
