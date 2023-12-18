import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 int d = sc.nextInt();
		 if(Math.abs(a - c) <= d || (Math.abs(a - b) <= d && Math.abs(c - b) <= d)) {
			 System.out.println("YES");
		 } else {
			 System.out.println("NO");
		 }
	}
}
