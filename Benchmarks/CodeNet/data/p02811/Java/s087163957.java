import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int k,z;
		do {
			k = stdIn.nextInt();
			z = stdIn.nextInt();
		}while(k<1||k>100||z<1||z>100000);
		if(500*k>=z) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
