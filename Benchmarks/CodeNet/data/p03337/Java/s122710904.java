import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = A + B;
		int Y = A - B;
		int Z = A * B;
		int Ans = Math.max(X, Y);
		Ans = Math.max(Ans, Z);
		System.out.println(Ans);
	}
}