import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int D = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= M; i++) {
			for(int j = 1; j <= D; j++) {
				if(j % 10 < 2 || j / 10 < 2) continue;
				if((j % 10) * (j / 10) == i) ans++;
			}
		}
		System.out.println(ans);
	}
}
