import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String abc ="ABC";
		String arc ="ARC";
		
		if(S.equals(abc)) {
			System.out.println("今週開催されるのは"+arc);
		}else {
			System.out.println("今週開催されるのは"+abc);
		}
		
	}

}