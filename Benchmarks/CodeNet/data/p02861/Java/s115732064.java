import java.util.Scanner;

public class Main {

    public static double dist(int[] arr1, int[] arr2) {
    	double res = (arr1[0] - arr2[0])*(arr1[0] - arr2[0])
    			+ (arr1[1] - arr2[1])*(arr1[1] - arr2[1]);
    	return Math.sqrt(res);
    }
    
	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);
		int N = in.nextInt();
		// String S = in.next();
		int dist[][] = new int[N][2];
		for (int i = 0; i < N; i++) {
			dist[i][0] = in.nextInt();
			dist[i][1] = in.nextInt();
		}
		double ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				ans += dist(dist[i], dist[j]);
			}
			
		}
		System.out.println(String.format("%.07f", ans/N));
		
	}

}
