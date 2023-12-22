import java.util.Scanner;

public class Main {
	static int yono;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arrayA = new int[m];
		int[] arrayB = new int[m];
		for(int i=0;i<m;i++) {
			arrayA[i]=sc.nextInt();
			arrayB[i]=sc.nextInt();
		}
		sc.close();

		System.out.println((n-1)-m);


	}

}