import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		for(int loop = 0 ; loop < A ; loop++){
			B = B * 100;
		}
		
		System.out.println(B);
	}
}