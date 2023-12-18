import java.util.Scanner;

public class main {
	static int R;
	static double L;
	public static void main(String args[]){
		Scanner scanner =new Scanner(System.in);
		System.out.println("R");
		R=scanner.nextInt();
		L=R*2*3.141592653589793238462643383279;
		System.out.println(L);
	}
}
