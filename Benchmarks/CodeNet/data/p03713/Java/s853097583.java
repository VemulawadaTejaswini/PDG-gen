import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long H = scan.nextLong();
        long W = scan.nextLong();
        if (H%3 == 0 || W%3 == 0) {
            System.out.println(0);
            return;
        }
        long ans = Integer.MAX_VALUE;
        long w1 = W/2;
        long w2 = W-w1;
        long h1 = H/2;
        long h2 = H-h1;
        for(int i = 1; i <= H/2; i++) {
            long h = W*i;
            long amari1 = (H-i)*w1;
            long amari2 = (H-i)*w2;
            long maxa = Math.max(amari1, amari2);
            long mina = Math.min(amari1, amari2); 
            long max = Math.max(h, maxa);
            long min = Math.min(h, mina);
            if (max-min < ans) {
                ans = max-min;
            }
            //System.out.println("h: "+h+" "+maxa+" "+mina+" "+ans);
        }
        for (int i = 1; i <= W/2; i++) {
            long w = H*i;
            long amari1 = (W-i)*h1;
            long amari2 = (W-i)*h2;
            long maxa = Math.max(amari1, amari2);
            long mina = Math.min(amari1, amari2);
            long max = Math.max(w, maxa);
            long min = Math.min(w, mina);
            if (max - min < ans) {
                ans = max - min;
            }
            //System.out.println("w: "+w+" "+maxa+" "+mina+" "+ans);
        }
        System.out.println(ans);
    }
}