import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sLength = a + b + 1;
		String s = sc.nextLine();
		
		if(sLength == s.length()) {
			if(s.substring(a, a+1).equals("-")) {
				System.out.println("Yes");
			}
		}else {
			System.out.println("No");
		}
		
	}

}
