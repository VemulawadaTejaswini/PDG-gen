import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] A;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		A = new int[n];
		for(int i = 0; i < n; i++){
			A[i] = scan.nextInt();
		}

		int q = scan.nextInt();

		for(int y = 0; y < q; y++){
			System.out.println(isSolve(0,scan.nextInt()) ? "yes" : "no");
		}
	}

	public static boolean isSolve(int i, int m){
		if(m == 0) return true;
		if(i >= n) return false;

		return isSolve(i + 1, m) || isSolve(i + 1, m - A[i]);

	}
}