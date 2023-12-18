import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		sc.close();
		
		String ans = "ABC";
		
		ans += Integer.toString(n);
		
		System.out.println(ans);
	}

}
