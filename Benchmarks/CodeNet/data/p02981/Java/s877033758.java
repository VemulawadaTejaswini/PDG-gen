import java.util.Scanner;
public class Main {
	public static void  main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(n *a < b ? n*a : b);
		s.close();


	}

}