import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		String[] array = new String[n];
//		for(int i=0;i<n;i++) {
//				array[i] = sc.next();
//		}
		sc.close();

		if(n==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}
}
