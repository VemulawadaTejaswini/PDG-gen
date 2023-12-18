import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        long a = Long.valueOf(sc.next());
        long b = Long.valueOf(sc.next());
        long c = Long.valueOf(sc.next());
        long d = Long.valueOf(sc.next());
        long ans = 0;
        
        for (long i = a; i <= b; i++) {
            if (i % c != 0 && i % d != 0) {
                ans++;
            }
        }
        System.out.println(ans);

		sc.close();
	}
}
