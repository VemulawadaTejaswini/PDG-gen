import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		};
		sc.close();
		int o=1;
		for(int i=0; i<n; i++){
			if(A[i]%2 == 0) o *=2;
		};
		System.out.println((int)Math.pow(3,n) - o);
	}
}
