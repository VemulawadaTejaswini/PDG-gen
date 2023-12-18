import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		int minDiff = 1000;
		for(int i = 0;i <= S.length()-3;++i) {
			int cap = Math.abs(753 - Integer.parseInt(S.substring(i, i+3)));
			if(minDiff > cap) {
				minDiff = cap;
			}
		}
		
		System.out.println(minDiff);
	}
}
