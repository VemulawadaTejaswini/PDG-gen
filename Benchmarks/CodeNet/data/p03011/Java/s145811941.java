import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int p = kbd.nextInt();
        int q = kbd.nextInt();
        int r = kbd.nextInt();
        int pq = p + q;
        int qr = q + r;
        int rp = r + p;
        if (pq <= qr && pq <= rp) {
            System.out.println(pq);
        } else if (qr <= pq && qr <= rp) {
            System.out.println(qr);
        } else if (rp <= pq && rp <= qr) {
            System.out.println(rp);
        }
    }
}