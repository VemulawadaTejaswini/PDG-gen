import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++)
			x[i] = sc.nextInt();
		int answer = 1000000000;
		int[] distance = new int[n-k+1];
		for(int i = 0; i < n-k+1; i++) {
			distance[i] = Math.abs(x[i+k-1]-x[i]);
			distance[i] += Math.min(Math.abs(x[i+k-1]), Math.abs(x[i]));
		}
		for(int i = 0; i < n-k+1; i++)
			answer = Math.min(answer, distance[i]);
		System.out.println(answer);
	}

}