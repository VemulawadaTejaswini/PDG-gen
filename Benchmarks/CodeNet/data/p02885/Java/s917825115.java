import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int A=in.nextInt(),B=in.nextInt();
		
		if(A>2 *B) {
			int a = A- 2*B;
			System.out.println(a);
		}
		else {
			System.out.println(0);
		}

	}

}
