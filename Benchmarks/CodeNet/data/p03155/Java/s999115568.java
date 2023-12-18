import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int ans = ((h>n) || (w>n))
			? 0
			: (n+1-h)*(n+1-w);
		System.out.println(ans);
	}
}
