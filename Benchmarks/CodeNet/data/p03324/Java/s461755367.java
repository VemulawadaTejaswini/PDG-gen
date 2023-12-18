import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      
     Scanner sc = new Scanner(System.in);
		int D = sc.nextInt(); //0=1,1=10000,2=100000
		int N = sc.nextInt();

		if (D == 0) {
			System.out.println(N);
		} else if (D == 1) {
			System.out.println(100 * N);
		} else if (D == 2) {
			System.out.println(10000 * N);
		}
	}
}
