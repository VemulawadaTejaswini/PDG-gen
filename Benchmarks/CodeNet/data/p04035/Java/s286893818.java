import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] ropeSum = new int[n+1];

		for(int i=1; i<=n; i++) {
			ropeSum[i] = ropeSum[i-1] + sc.nextInt();
		}
		int[][] cut = new int[n][n];
		for(int inc=0; inc<n; inc++) {
			for(int i=0; i+inc<n; i++) {
				if(inc==0) cut[i][i] = -1;
				else {
					if(ropeSum[i+inc+1]-ropeSum[i]<l) cut[i][i+inc] = -2;
					else {
						int c = i;
						for( ; c<i+inc; c++) {
							boolean left = cut[i][c]==-1 || cut[i][c]>0;
							boolean right = cut[c+1][i+inc]==-1 || cut[c+1][i+inc]>0;
							if(left && right) {
								cut[i][i+inc] = c + 1;
								break;
							}
						}
					}
				}
			}
		}
		System.out.println((cut[0][n-1]>0 || n==1) ? "Possible" : "Impossible");
		if(cut[0][n-1]>0) PrintResult(cut, 0, n-1);
	}

	public static void PrintResult(int[][] cut, int begin, int end) {
		if(begin==end) return;
		System.out.println(cut[begin][end]);
		PrintResult(cut, begin, cut[begin][end] - 1);
		PrintResult(cut, cut[begin][end], end);
	}
}