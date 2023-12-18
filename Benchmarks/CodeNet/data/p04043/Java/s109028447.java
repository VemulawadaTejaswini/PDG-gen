import java.util.Scanner;

public class Haiku {
	public static void main(String[] args) {
		
		String result = "NO";
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if((A == 5 && B == 7 && C == 5) || (A == 7 && B == 5 && C == 5) ||  (A == 5 && B == 5 && C == 7)) {
			result = "YES";
			
		}
		System.out.println(result);

	}
}
