import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = 2;
		int B = 3;
		int C = 3;
		
		if(A*B*C%2 == 0){
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		scan.close();
	}
}