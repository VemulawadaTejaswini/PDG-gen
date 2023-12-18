import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		Map<Integer, Integer> ans = new HashMap<>();
		for(int i = 1; i < N; i++)
			ans.put(i, 0);
		for(int i = 1; i <= N; i++) {
			for(int j = i+1; j <= N; j++) {
				int d = Math.min(j-i, Math.min(Math.abs(X-i)+1+Math.abs(Y-j), Math.abs(Y-i)+1+Math.abs(X-j)));
				ans.put(d, ans.get(d)+1);
			}
		}
		for(int i = 1; i < N; i++)
			System.out.println(ans.get(i));
	}

}