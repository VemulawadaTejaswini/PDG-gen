import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int p = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		int r = Integer.parseInt(sc.next());
		sc.close();
		int pq = p + q;
		int qr = q + r;
		int rp = r + p;
		System.out.println(Math.min(Math.min(pq, qr),rp));
	}
}