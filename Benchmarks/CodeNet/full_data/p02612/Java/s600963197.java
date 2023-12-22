import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rest = n%1000;
		if(rest==0) System.out.println(0);
		else System.out.println(1000-rest);

	}

}
