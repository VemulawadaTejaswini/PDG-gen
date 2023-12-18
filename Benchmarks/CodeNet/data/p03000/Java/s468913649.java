import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt();
		int l[] = new int[n];
		int d = 0;
		int ans = 1;
		for(int i = 0; i < n; ++i) {
			l[i] = sc.nextInt();
			d += l[i];
			if(d <= x)ans++;
		}
		sc.close();
		System.out.println(ans);
	}
}
