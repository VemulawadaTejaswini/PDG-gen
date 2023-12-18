import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			String alpha = sc.next();
			
			int next = (int)alpha.charAt(0) + 1;
			
			char c = (char)next;
			
			System.out.println(String.valueOf(c));
		}
	}
}