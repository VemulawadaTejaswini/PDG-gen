import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String T = scan.nextLine();
		scan.close();
		
		for(int i = 0; i < S.length(); i++) {
			String Sstr = "[" + S.charAt(i) + "]";
			String Tstr = "[" + T.charAt(i) + "]";
			
			if(!(S.replaceAll(Sstr, "*").replaceAll("[^*]", "_").equals(T.replaceAll(Tstr, "*").replaceAll("[^*]", "_")))) {
				System.out.print("No");
				return;
			}
		}
		System.out.print("Yes");
	}
}
