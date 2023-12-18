import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		String s = "No";
		if(a==b && b!=c) s="Yes";
		if(a==c && b!=c) s="Yes";
		if(c==b && a!=c) s="Yes";
		System.out.println(s);
	}

}