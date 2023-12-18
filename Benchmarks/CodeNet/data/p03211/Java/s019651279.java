import java.util.Scanner;

public class Main {
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String S = s.next();
		int min = Integer.MAX_VALUE;
		for(int i = 0;i < S.length()-2;i++) {
			min = Math.min(min, Math.abs(753 - Integer.parseInt(S.substring(i, i+3))));
		}
		System.out.println(min);
	}
}