import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		int cnt = 0;
		for(int i = 0; i < N; i ++) {
			a[i] = sc.nextInt();
			if(a[i] % 2 == 0) {
				if(a[i] % 4 == 0) {
					cnt += 2;
				} else {
					cnt++;
				}
			}
		}
		int goal = (N / 2) * 2;
		if(goal <= cnt) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
