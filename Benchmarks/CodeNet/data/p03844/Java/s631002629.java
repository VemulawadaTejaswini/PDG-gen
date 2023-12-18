import java.util.Scanner;
public Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String OP = sc.next();
		int B = sc.nextInt();
		if (OP.endsWith("+"))  System.out.println(A+B);
		else  System.out.println(A-B);
	}
}
