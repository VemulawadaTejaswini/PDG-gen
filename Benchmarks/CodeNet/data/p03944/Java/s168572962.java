import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();

        int[][] xy = new int[n][2];
        int[] a    = new int[n];

        for(int i=0; i<n; i++) {
            xy[i][0] = sc.nextInt(); // w
            xy[i][1] = sc.nextInt(); // h
            a[i]     = sc.nextInt();
        }
        sc.close();

        int cw = 0;
        int ch = 0;

        for(int i=0; i<n; i++) {
            switch(a[i]) {
                case 1:
                    cw = Math.max(cw, xy[i][0]);
                    break;
                case 2:
                    w = Math.min(w, xy[i][0]);
                    break;
                case 3:
                    ch = Math.max(ch, xy[i][1]);
                    break;
                case 4:
                    h = Math.min(h, xy[i][1]);
                    break;
            }
        }

        int sq = (w-cw) * (h-ch);
        if(sq <= 0) {
            System.out.println(0);
        } else {
            System.out.println(sq);
        }
    }
}
