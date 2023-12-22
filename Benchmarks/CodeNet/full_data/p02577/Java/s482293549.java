import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			String s = sc.next();
			
			long sum = 0;
			
			for(int i = 0 ; i < s.length() ; i++ ) {
				char c = s.charAt(i);
				int digit = c - '0';
				sum += digit;
			}
			
			System.out.println(sum % 9 == 0 ? "Yes" : "No");
		}
	}

}