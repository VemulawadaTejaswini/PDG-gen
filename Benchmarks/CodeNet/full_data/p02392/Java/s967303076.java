import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = Integer.parseInt(in.next());
		int b = Integer.parseInt(in.next());
		int c = Integer.parseInt(in.next());
		
		System.out.println(a < b && b < c ? "Yes" : "No");
	}
}	
