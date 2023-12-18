import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		//
		if(A- B >= 0) {
			System.out.println("delicious");
		}else {
			if(X >= Math.abs(A - B)) {
				System.out.println("safe");
			}else {
				System.out.println("dangerous");
			}
		}
		
	}
}