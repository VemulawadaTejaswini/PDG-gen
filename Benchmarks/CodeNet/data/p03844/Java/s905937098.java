import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(), B=sc.nextInt();
		String op = sc.next();
		
		if(op.equals("+")){
			System.out.println(A+B);
		}
		else if (op.equals("+")){
			System.out.println(A-B);
		}
	}
}