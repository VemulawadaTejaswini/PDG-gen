import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String  T = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String U = sc.next();
		if(U == S) B--;
		else A--;
		System.out.println(A+ " "+B);
		
	}
}