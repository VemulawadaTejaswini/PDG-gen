import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		char[] S = s.toCharArray();
		boolean key = true;
		if (N%2 == 0) {
			for (int i = 0; i < S.length/2; i++) {
				if (S[i] != S[S.length/2+i]) {
					key = false;
				}
			}
		} else {
			key = false;
		}
		System.out.println(key? "Yes" : "No");
	}
}