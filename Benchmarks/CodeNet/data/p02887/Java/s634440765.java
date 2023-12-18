import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char[] C = S.toCharArray();
		int count = 1;
		for(int i=0; i<N-1; i++) {
			if(C[i]!=C[i+1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}