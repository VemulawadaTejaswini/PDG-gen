import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			X += (D/A[i]);
			if(D%A[i] !=0) {
				X++;
			}
		}
		System.out.println(X);
	}

}
