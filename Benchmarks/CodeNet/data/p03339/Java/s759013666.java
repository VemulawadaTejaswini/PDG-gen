import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] w = new int[n + 1];
		int[] e = new int[n + 1];
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) == 'W') w[i + 1] += w[i] + 1;
			else w[i + 1] = w[i];
		}
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) == 'E') e[i + 1] += e[i] + 1;
			else e[i + 1] = e[i];
		}
//		System.out.println(Arrays.toString(w));
//		System.out.println(Arrays.toString(e));
		int ans = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ; i++) {
			ans = Math.min(ans, w[i] + (e[n] - e[i]));
		}
		System.out.println(ans);
	}
}
