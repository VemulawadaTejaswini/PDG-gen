import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int x = 0, xMax = 0;
		for(int i = 0; i < N; i++) {
			if(S[i] == 'I') {
				x++;
				if(x >= xMax) xMax = x;
			}
			if(S[i] == 'D') x--;
		}
		System.out.println(xMax);
	}
}