import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		final int N = sc.nextInt();
		final String S = sc.next();
		int max = x;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'I') x++;
			else if(S.charAt(i) == 'D') x--;
			if(max < x) max = x;
		}
		System.out.println(max);
	}
}