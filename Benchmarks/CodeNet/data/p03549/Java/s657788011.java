import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int a = (n-m)*100 + m*1900;
		
		System.out.println(a<<m);
		in.close();

	}

}
