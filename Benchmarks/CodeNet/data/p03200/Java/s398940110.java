import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		int a = S.length() - 1;
		int sum = 0;
		
		for(int i = S.length() - 1; i >= 0; i--) {
			if(S.charAt(i) == 'B') {
				sum += a - i;
				a--;
			}
		}
		System.out.println(sum);
	}
}
