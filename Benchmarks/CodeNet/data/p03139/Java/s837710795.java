import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print(Math.min(a, b));
		System.out.print(" ");
		System.out.print(Math.min(a-(n-b),b-(n-a)) > 0 ? Math.min(a-(n-b),b-(n-a)) : "0");
		
		sc.close();
	}

}
