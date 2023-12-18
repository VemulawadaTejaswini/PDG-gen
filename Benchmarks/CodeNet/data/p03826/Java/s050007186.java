import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		int s1 = A*B;
		int s2 = C*D;

		if(s1>s2){
			System.out.println(s1);
		}else{
			System.out.println(s2);
		}

	}

}
