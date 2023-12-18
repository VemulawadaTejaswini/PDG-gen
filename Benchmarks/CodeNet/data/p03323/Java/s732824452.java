import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		
		//間違った解法
		/*if(Math.abs(A - B) < 2) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}*/
		
		if(A <= 8 && B <= 8) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}
	}
}