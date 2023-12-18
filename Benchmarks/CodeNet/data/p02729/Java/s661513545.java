import java.util.Scanner;

public class Main {

	public static void main(String... nui) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		int nm = n + m;
		
		System.out.println(nm * (nm - 1) / 2 - n * m);
		
	}

}