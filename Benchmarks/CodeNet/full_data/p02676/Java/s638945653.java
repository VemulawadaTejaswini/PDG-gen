import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		String s;
		int K;
		String tmp;
		Scanner input = new Scanner(System.in);
		K = input.nextInt();
		tmp = input.nextLine();
		s = input.next();
		if(s.length() < K+1) {
			System.out.println(s);
		}else {
			System.out.println(s.charAt(0) + "...");
		}
		input.close();
	}
	
}
