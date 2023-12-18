import java.util.Scanner;

public class Main {

	static int n;
	static int q;
	static int[] result ;
	static int[][] inheritence;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		n = sc.nextInt();
		q = sc.nextInt();

		result = new int[n];
		inheritence = new int[n-1][2];

		for(int i=0; i<n-1; i++) {
			result[i] =  0;
			inheritence[i][0] =  sc.nextInt();
			inheritence[i][1] =  sc.nextInt();
		}

		for(int i=0; i<q; i++) {
			int p =  sc.nextInt();
			int x =  sc.nextInt();

			for(int k=n-1; k>=0; k--) {
				if(isIncluded(k+1, p)) {
					result[k] += x;
				}
				if(k<p) {
					break;
				}
			}
		}

		for(int i=0; i<n; i++) {
			if(i != 0) {
				System.out.print(" ");
			}
			System.out.print(result[i]);
		}

	}

	private static boolean isIncluded(int target, int source) {
		int parent = 0;
		for(int i=0; i<n-1; i++) {
			if(target == source) {
				return true;
			}
			if(inheritence[i][1] == target) {
				parent = inheritence[i][0];
				if(parent == source) {
					return true;
				}
				target = inheritence[i][0];
				i = -1;
				continue;
			}
		}
		return false;
	}
}