import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n = 0;
		int l = 0;
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
			if(c == 0) {
				l++;
			}
		}
		
		if(l == N) {
			k = false;
		}

		while(k) {
			n++;
			int sum = 0;
			for(Integer i = 0; i < N; i++) {
				int b = a.get(i);
				b /= 2;
				a.set(i, b);
				i++;
				if((b % 2) != 0) {
					k = false;
				}
			}
			for(Integer value : a) {
				sum += value;
			}
			if(sum == 0) {
				k = false;
			}
		}
		System.out.println(n);
		scan.close();
	}
}