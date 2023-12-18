package beginner080;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	//A
	public static void main(){
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int x1 = N*A;
		int x2 = B;
		System.out.println(Math.min(x1,x2));
	}

}
