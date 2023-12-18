import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean yes = true;
		if(S.equals("AAA") || S.equals("BBB")) yes = false;
		if(yes) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}


