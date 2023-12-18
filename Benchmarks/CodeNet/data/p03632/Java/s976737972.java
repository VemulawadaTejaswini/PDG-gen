import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if(B>C && C>A) {
			if(B>D) {
				System.err.println(B-C-A);
			}else {
				System.err.println(B-D+C);
			}
		}else{
			System.out.println("0");
		}
	}

}