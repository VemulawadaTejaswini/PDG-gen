import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int favNum = 753;
		String s = sc.next();
		
		
		int minDif = 1000;
		for (int i = 0; i < s.length() - 2; i++) {
			int num = Integer.valueOf(s.substring(i, i + 3));
			minDif = Math.min(minDif, Math.abs(favNum - num));
		}
		
		System.out.println(minDif);
		
		sc.close();
	}
}


