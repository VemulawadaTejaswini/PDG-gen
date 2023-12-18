import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] times = new int[n];
		for(int i=0; i<times.length; i++) {
			times[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] solve = new int[m];
		int[] problem = new int[m];
		for(int i=0; i<m; i++) {
			problem[i] = sc.nextInt();
			solve[i] = sc.nextInt();
		}
		int[] sum = new int[m];
		for(int i=0; i<problem.length; i++) {
			int number = problem[i];
			int itime = solve[i];
			sum[i] += itime;
			for(int j=0; j<times.length; j++) {
				if(number-1 == j) {
					continue;
				}
				sum[i] += times[j];
			}
		}
		
		for(int i=0; i<m; i++) {
			System.out.println(sum[i]);
		}
	}
}
