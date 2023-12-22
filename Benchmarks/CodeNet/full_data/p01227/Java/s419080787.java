import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		final int t = sc.nextInt();
		
		for(int tt = 0; tt < t; tt++){
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			
			int[] len = new int[n];
			for(int i = 0; i < n; i++){
				len[i] = sc.nextInt();
			}
			Integer[] dist = new Integer[n-1];
			for(int i = 0; i < n - 1; i++){
				dist[i] = len[i + 1] - len[i];
			}
			
			Arrays.sort(dist, Collections.reverseOrder());
			
			int sum = 0;
			for(int i = k - 1; i < n - 1; i++){
				sum += dist[i];
			}
			
			System.out.println(sum);
		}
	}

}