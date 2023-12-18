import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = 0, k = 0;
		int a, b, x = 0;
		n = stdin.nextInt();
		a = stdin.nextInt();
		b = stdin.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = stdin.nextInt();
		}
		Arrays.sort(A);
		while(A[n-1]>0){
			for(int j=0;j<n-1;j++){
				A[j]=A[j]-b;
			}
			A[n-1]=A[n-1]-a;
			k++;
			Arrays.sort(A);
		}
		System.out.println(k);
	}

}
