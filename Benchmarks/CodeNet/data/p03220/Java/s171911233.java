import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int idx = 0;
		long min = Integer.MAX_VALUE;
		for(int i = 1; i <= n; i++) {
			long tp = (long)(t - sc.nextInt() * 0.006);
			if(min > Math.abs(a - tp)) {
				min = Math.abs(a - tp);
				idx = i;
			}
		}
		System.out.println(idx);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
