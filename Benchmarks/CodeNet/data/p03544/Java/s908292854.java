import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> l = new ArrayList<Long>();
		l.add(2L);
		l.add(1L);
		long ans = 0;
		for(int i = 2; i <=n; i++) {
			 ans = l.get(i-1)+l.get(i-2);
			 l.add(ans);
		}
		System.out.println(l.get(l.size()-1));
	}

//	public static long lucas(int n) {
//		if(n==0) {
//			return 2;
//		}
//		else if(n==1) {
//			return 1;
//		}
//		else {
//			return lucas(n-1)+lucas(n-2);
//		}
//	}
}
