import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		boolean flag = true;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			if(a[i] % 2 == 1) flag = false;
		}
		
		
		if(flag) {
			System.out.println("first");
		} else {
			System.out.println("second");
		}
	}
}
