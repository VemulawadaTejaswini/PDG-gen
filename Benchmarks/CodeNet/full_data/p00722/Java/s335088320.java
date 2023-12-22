import java.util.*;

public class Main {
	public static BitSet isntprimenum = new BitSet(1000000);
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		setPrimeNum();
		while (stdin.hasNext()) {
			int a = stdin.nextInt();
			int d = stdin.nextInt();
			int n = stdin.nextInt();
			if (a == 0 && d == 0 && n == 0) break;
			for (int i = 0; i < n; i++){
				while (isntprimenum.get(a)) {
					a += d;
				}
				a += d;
			}
			System.out.println(a - d);
 		}
		System.exit(0);
	}
	public static void setPrimeNum() {
		isntprimenum.set(0, true);
		isntprimenum.set(1, true);
		for (int i = 2; i < 1000; i++) {
//			if (isntprimenum.get(i)) break;
			int j = i * 2;
			while (j < 100000) {
				isntprimenum.set(j, true);
				j += i;
			}
		}
	}
}