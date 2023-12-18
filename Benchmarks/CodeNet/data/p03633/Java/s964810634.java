import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Long> ts = new TreeSet<>();
		for(int i = 0; i < n; i++) {
			ts.add(sc.nextLong());
		}
		long max = ts.last();
		long warusu;
		boolean isOK = false;
		for(int i = 1;;i++) {
			warusu = max*i;
			isOK = true;
			for(long l : ts) {
				if(warusu % l == 0) {

				} else {
					isOK = false;
					break;
				}
			}
			if(isOK) {
				System.out.println(warusu);
				return;
			}
		}
	}
}