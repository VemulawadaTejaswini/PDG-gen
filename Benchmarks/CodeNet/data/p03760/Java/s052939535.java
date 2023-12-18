import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] O = sc.next().toCharArray();
		char[] E = sc.next().toCharArray();
		String ans = "";
		for (int i=0; i < Math.max(O.length, E.length); i++) {
			try {
				ans += O[i];
				ans += E[i];
			} catch (Exception ex){
		
			}
		}
		System.out.println(ans);
	}
}
