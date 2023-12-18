import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] l1 = br.readLine().split(" ");

		int n = Integer.parseInt(l1[0]);
		int x = Integer.parseInt(l1[1]);
		int y = Integer.parseInt(l1[2]);

		int[][] cost = new int[n][n];

		for(int i = 0; i < n; ++i) {
			for(int j = 0; j< n; ++j) {

				int dis = Math.abs(j - i);

				int temp = Math.abs(x -1 -i) + Math.abs(y -1 -j) + 1;
				if(temp < dis) {
					dis = temp;
				}
				temp = Math.abs(y-1 -i) + Math.abs(x-1 - j) + 1;
				if(temp < dis) {
					dis = temp;
				}
				
				cost[i][j]=dis;				
			}
		}		

		for(int k = 1; k< n;++k) {
			int cnt = 0;
			for(int i = 0; i<n;++i) {
				for(int j = i; j<n; ++j) {
					if(cost[i][j]==k) ++cnt;
				}
			}
			System.out.println(cnt);
		}
	}
}