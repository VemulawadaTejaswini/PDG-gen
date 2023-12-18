import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] p = new int[n];
		for(i=0;i<n;i++) {
			p[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(p);
		p[n-1] /= 2;
		int ans;
		ans = Arrays.stream(p).sum();
		System.out.println(ans);
	}
}
