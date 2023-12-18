import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int l=s.length();
		System.out.println(s.charAt(0)+""+(l-2)+""+s.charAt(l-1));
	}
}
