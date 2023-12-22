import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag = true;
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a >= b) {flag = false;}
		int c = sc.nextInt();
		if (b >= c) {flag = false;}
		System.out.println(flag==true?"Yes":"No");
		
	}
}

