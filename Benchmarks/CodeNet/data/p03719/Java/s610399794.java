import java.util.Scanner;

public class Beginners061A {

	public static void main(String[] args) {

		String ans = "NO";
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if (a <= b && b <= c){
			
			ans = "YES";
		}

		System.out.print(ans);
		return;
	}
}