import java.util.*;

public class Main {
    Scanner sc;
    int[] d = {0,1,2,3};
    void run() {
        sc = new Scanner(System.in);

        while (true) {
            int wh=0,wl=0;
            int hh=0,hl=0;
            int n = sc.nextInt();
            if(n==0) break;
            Square[] sq = new Square[n];
            sq[0] = new Square(0);
            for (int i=1;i<n;i++) {
                sq[i] = new Square(i, sq[sc.nextInt()], sc.nextInt());
                hh = Math.max(sq[i].getHight(),hh);
                hl = Math.min(sq[i].getHight(),hl);
                wh = Math.max(sq[i].getWide(),wh);
                wl = Math.min(sq[i].getWide(),wl);
            }
            System.out.println((wh-wl+1) + " " + (hh-hl+1));
        }
    }
    
    public static void main(String[] args) {
        new Main().run();
    }

    int[] px = {-1,0,1,0};
    int[] py = {0,-1,0,1};
    class Square {
        int n;
        int h0;
        int w0;
        Square (int n) {
            this.n = n;
            h0 = 0;
            w0 = 0;
        }
        Square (int n, Square s, int d) {
            this.n = n;
            h0 = s.getHight() + py[d];
            w0 = s.getWide() + px[d];
        }
        int getHight() {
            return h0;
        }
        int getWide() {
            return w0;
        }
    }

}