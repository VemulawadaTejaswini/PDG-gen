import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		int ans = 0;
		for(int i = 0; i < S.length-1; i++) {
			if(S[i+1] != S[i])
				ans += 1;
		}
		System.out.println(ans);
	}

}
