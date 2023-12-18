import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		String a;
		int min = 1000;
		
		for(int i = 0; i < S.length() - 2; i++) {
			a = S.substring(i, i + 3);
			int X = Integer.parseInt(a);
			min = Math.min(min, Math.abs(X - 753));		
		}
		
		System.out.println(min);
		
	}
}
