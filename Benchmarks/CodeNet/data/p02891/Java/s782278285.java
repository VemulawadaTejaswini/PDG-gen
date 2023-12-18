import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		int B = 0;
		int count = 1;
		long ans = 0;

		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i+1) == s.charAt(i)) {
				count++;
			}else {
				A.add(count);
				count = 1;
			}
		}

		A.add(count);
		int fnum1 = A.get(0);
		int fnum2 = A.get(A.size()-1);

		if(s.charAt(0) == s.charAt(s.length()-1)) {

			if(A.size() == 1) {

				ans = A.get(0)*k/2;

			}else {

				B = fnum1+fnum2;
				A.remove(A.size()-1);
				A.remove(0);

				for(int a: A) {
					ans += a/2;
				}

				ans += B/2;
				ans = ans*(k-1);
				ans += fnum1/2 + fnum2/2;

				for(int a: A) {
					ans += a/2;
				}

			}

		}else {

			for(int a: A) {
				ans += a/2;
			}
			ans = ans*(k);
		}

		System.out.println(ans);
		sc.close();
	}
}