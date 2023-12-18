import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a[][] = new int[m][2];
		for (int i=0; i<m; i++){
			a[i][0] = scanner.nextInt();
			a[i][1] = scanner.nextInt();
		}

		a = sort(a);
		int ans = 0;
		int begin = 0;
		int end = n;
		for(int i=0; i<m; i++){
			begin = Math.max(begin, a[i][0]);
			end = Math.min(end, a[i][1]);
			if (begin>=end) {
				ans++;
				begin = a[i][0];
				end = a[i][1];
			}
		}
		ans++;
		System.out.println(ans);

	}

	static int[][] sort(int[][] a){
		for(int i=0;i<a.length-2; i++){
			if (a[i][0]>a[i+1][0]){
				int[] b = a[i];
				a[i] = a[i+1];
				a[i+1] = b;
			}
		}
		return a;
	}

}