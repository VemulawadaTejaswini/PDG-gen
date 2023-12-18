import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A > B) System.out.print("GREATER");
		else if(A < B) System.out.print("LESS");
		else System.out.print("EQUAL");
	}

}