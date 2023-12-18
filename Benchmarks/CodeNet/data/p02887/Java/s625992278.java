import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int ans = 1;
		
		for(int i=1; i<N; i++)
			if(s[i]!=s[i-1])
				ans++;

		System.out.println(ans);
		sc.close();
	}
}
