import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(aCheck(s)&&cCheck(s)&&sCheck(s)?"AC":"WA");
	}
	private static boolean aCheck(String str){
		return str.matches("^A.*");
	}
	
	private static boolean cCheck(String str){
		return str.matches("^.{2}.*C.*.{1}$");
	}
	
	private static boolean sCheck(String str){
		return str.matches("^.[a-z]*C[a-z]*$");
	}
}
