import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int Z = scan.nextInt();
		int tmp = X;
		X = Y;
		Y = tmp;
		tmp = X;
		X = Z;
		Z = tmp;
		System.out.println(X+" "+Y+" "+Z);
	}
}