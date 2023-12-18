import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), t = sc.nextInt();
		int t1[] = new int[n];
		long ans = 0, tmp = 0;
		int pt = 0; 
		for(int i = 0; i < n; ++i) {
			t1[i] = sc.nextInt();
			int t2 = t1[i] - pt;
			if(t2 < tmp)tmp = t + t2;
			else {
				ans += tmp;
				pt = t1[i];
				tmp = t;
			}
		}
		ans += tmp;
		sc.close();
		System.out.println(ans);
	}

}
