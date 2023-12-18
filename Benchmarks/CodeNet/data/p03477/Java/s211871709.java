import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int L = A + B;
		int R = C + D;

		if(L>R){
			System.out.println("Left");
		}else if (L == R){
			System.out.println("Balanced");
		}else{
			System.out.print("Right");
		}
	}
}


}
