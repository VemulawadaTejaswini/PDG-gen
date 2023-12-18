import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Integer[] a = new Integer[n];
		Integer[] a_ = new Integer[n];
		Integer[] b = new Integer[n];
		Integer[] b_ = new Integer[n];



		for (int i = 0; i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());

		}

		for (int i = 0; i < n ; i++) {
			b[i] = Integer.parseInt(sc.next());
		}

		a_ = Arrays.copyOf(a, a.length);
		b_ = Arrays.copyOf(b, b.length);
		
		
		
		Arrays.sort(a);
		Arrays.sort(b);


		String ans = "Yes";
		for (int i = 0; i < n ; i++) {
			if(a[i] > b[i]) {
				ans = "No";
				break;
			}
		}

		
		boolean flag = false;
		for (int i = 0; i < n ; i++) {
				
				if(a_[i] <= b_[i] && b_[i] <= b[i]) {
					flag = true;
				}
		}

		if(!flag) {
			ans = "No";
		}
		
		System.out.println(ans);
	}

}