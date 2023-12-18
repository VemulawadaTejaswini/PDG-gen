import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// get a integer
		String s = sc.nextLine();
		
		if (Main.IfgetCF(s))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		sc.close();
	}
	
	static boolean IfgetCF(String str) {
		int C = 0;
		int F = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'C' || str.charAt(i) == 'F') {
				if (C == 0)
				{
					C++;
				}
				else {
					if (str.charAt(i) == 'F')
						F++;
				}
				
			}
		}
		
		if (C != 0 && F != 0)
			return true;
		else
			return false;
	}
}