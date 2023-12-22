import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			int[][] a = new int[n][4];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 4; j++) {
					a[i][j] = stdIn.nextInt();
				}
			}
			int p = stdIn.nextInt();
			int q = stdIn.nextInt();
			int r = stdIn.nextInt();
			int c = stdIn.nextInt();
			
			int[] ok = new int[n];
			int okp = 0;
			
			for(int i = 0; i < n; i++) {
				int cal = 0;
				cal += a[i][1]*4;
				cal += a[i][2]*9;
				cal += a[i][3]*4;
				if(cal <= c && a[i][1] <= p &&  a[i][2] <= q && a[i][3] <= r)  {
					ok[okp++] = a[i][0];
				}
			}
			if(okp == 0) {
				System.out.println("NA");
			}
			else {
				for(int i = 0; i < okp; i++) {
					System.out.println(ok[i]);
				}
			}
		}
	}

}