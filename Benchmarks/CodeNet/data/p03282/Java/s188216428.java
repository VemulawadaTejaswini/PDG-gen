import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s =scanner.nextLine();
		long n = scanner.nextLong();
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!='1'){
				System.out.println(s.charAt(i)-'0');
				return;
			}
		}
		
		System.out.println(1);
	}
}
