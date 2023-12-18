import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int A, B ,C = 0;
		A = X;
		B = Y;
		C = Z;
		
		B = A;
		A = Y;
		C = A;
		A = Z;
		System.out.println(A + " " + B + " " + C);
	}
}