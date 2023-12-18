import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();

		int delicious = B - A;
		
		if(X+1 < A){
			System.out.println("dangerous");
		} else if (delicious < 0) {
			System.out.println("delicious");
		} else {
			System.out.println("safe");
		}
		
		
		
	}
}
