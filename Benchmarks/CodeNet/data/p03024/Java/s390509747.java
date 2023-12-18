import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		int count = 0;
		
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'x')
				count++;
		}
		
		if (((15 - S.length())+count)>= 8)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}