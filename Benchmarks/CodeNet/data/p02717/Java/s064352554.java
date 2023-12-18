import java.util.Scanner;

public class Atcoder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int temp = X;
		X = Y;
		Y = temp;
		temp = X;
		X = Z;
		Z = temp;
		System.out.println(X+" "+Y+" "+Z);
	}

}
