import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int firstB = S.indexOf("B");
		int countB = 0;
		int answer = 0;
		for (int i = firstB; i < S.length(); i++) {
			if (S.charAt(i) == 'B') {
				countB++;
			} else {
				answer += countB;
			}
		}
		System.out.println(answer);
	}
}