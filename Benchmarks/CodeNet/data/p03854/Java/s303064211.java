import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		
		S = S.replace("eraser", "").replace("erase", "").replace("dreamer", "").replace("dream", "");
		
		if( !S.equals("")) {
			System.out.println("No");
			System.exit(0);
		}else {
			System.out.println("Yes");
		}
	}
}