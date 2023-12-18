import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] str = s.toCharArray();

		int num = str[0] + 1;
		char c  = (char)(num);

		System.out.print(c);
 
		sc.close();
 
	}
}