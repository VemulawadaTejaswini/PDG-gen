import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n = 0;
		int N;
		boolean k = true;
		ArrayList<Integer> a = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		for(int i = 0; i < N; i++) {
			a.add(new Integer(scan.nextInt()));
			Integer b = a.get(i);
			int c = b.intValue();
			if((c % 2) != 0) {
				k = false;
			}
		}

		while(k) {
			for(Integer i = 0; i < N; i++) {
				int b = a.get(i);
				b = a.get(i)/2;
				a.set(i, b);
				i++;
				if((b % 2) != 0) {
					k = false;
				}
			}
			if(k) {
				n++;
			}
		}
		System.out.println(n);
		scan.close();
	}
}