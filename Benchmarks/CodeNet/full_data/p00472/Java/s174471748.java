import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			int[] dist = new int[n];
			dist[0] = 0;
			for(int i = 1; i < n; i++){
				dist[i] = dist[i-1] + sc.nextInt();
			}
			
			int d = 0;
			int state = 0;
			for(int i = 0; i < m; i++){
				int pos = sc.nextInt();
				int loop = Math.abs(pos);
				
				d += Math.abs(dist[state] - dist[state+pos]);
				state += pos;
				
				
				d %= 100000;
			}
			
			System.out.println(d);
		}
	}

}