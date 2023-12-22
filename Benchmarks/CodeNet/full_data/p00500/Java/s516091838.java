import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[][] k = new int[n][3];
		int[] point = new int[n];
		for(int i = 0; i < n; i++) {
			k[i][0] = stdIn.nextInt();
			k[i][1] = stdIn.nextInt();
			k[i][2] = stdIn.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			int[] cc = new int[101];
			for(int j = 0; j < n; j++) {
				cc[k[j][i]]++;
			}
			for(int j = 0; j < n; j++) {
				if(cc[k[j][i]] == 1) {
					point[j] += k[j][i];
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(point[i]);
		}
		
		
	}

}