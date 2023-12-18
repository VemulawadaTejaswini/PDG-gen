import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int N = s.length();
		int max = -1;
		for(int i = 0 ; i < N ; i++) {
			for(int j = i + 1 ; j < N ; j++) {
				if(s.charAt(i) == 'A' && s.charAt(j) == 'Z') {
					String S = s.substring(i, j + 1);
					int length = S.length();
					max = Math.max(max, length);
				}
			}
		}
		System.out.println(max);
	}
}
