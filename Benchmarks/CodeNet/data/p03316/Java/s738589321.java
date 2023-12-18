import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			int digit = Integer.parseInt(s.substring(i , i+1));
			sum += digit;
		}
		
		if((n % sum) == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}