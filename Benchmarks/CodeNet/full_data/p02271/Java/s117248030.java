import java.util.Scanner;


public class Main {

	public static boolean isSolved;
	public static int[] A;
	public static int n;
	
	static void solve(int index, int num) {
		if (num == 0) {
			isSolved = true;
			return;
		}

		if (isSolved || num < 0 || index == n) return;
		
		solve(index+1, num - A[index]);
		solve(index+1, num);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		
		int q = scan.nextInt();
		int[] M = new int[q];
		for (int i = 0; i < q; i++) {
			M[i] = scan.nextInt();
		}
		
		for (int i = 0; i < q; i++) {
			isSolved = false;
			
			solve(0, M[i]);
			
			if (isSolved) System.out.println("yes");
			else System.out.println("no");
		}
		
		scan.close();
	}

}