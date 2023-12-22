import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
public static void main(String[] args) {
	int n = s.nextInt();
	int u,k,v = 0;
	int min;
	int[] d = new int[n];
	int[][] T = new int[n][n];
	int[] times = new int[n];

	for(int i = 0;i < n;i++) {
		for(int j = 0;j < n;j++) {
			T[i][j] = -1;
		}
		d[i] = Integer.MAX_VALUE;
	}

	for(int i = 0;i < n;i++) {
		u = s.nextInt();
		k = s.nextInt();
		for(int j = 0;j < k;j++) {
			v = s.nextInt();
			T[u][v] = s.nextInt();
		}
	}
	d[0] = 0;
	times[0] = 1;
	while(true) {
		min = Integer.MAX_VALUE;
		int hantei = -1;
		for(int i = 0;i < n;i++) {
			if(min > d[i] && times[i] != 2) {
				hantei = i;
				min = d[i];
			}
		}
		if(hantei == -1) break;
		times[hantei] = 2;
		for(int i = 0;i < n;i++) {
			if(times[i] != 2 && T[hantei][i] != -1) {
				if(d[i] > d[hantei] + T[hantei][i]) {
					d[i] = d[hantei] + T[hantei][i];
					times[i] = 1;
				}
			}
		}
	}
	for(int i = 0;i < n;i++) {
		if(d[i] == Integer.MAX_VALUE) {
			System.out.println(i + " " + -1);
		}else {
			System.out.println(i + " " + d[i]);
		}
	}
}
}
