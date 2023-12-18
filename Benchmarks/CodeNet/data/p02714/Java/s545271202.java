import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //No TLE!!
		Scanner input = new Scanner(System.in);
		int N = Integer.parseInt(input.nextLine());
		String S = input.nextLine();
		int[][] counts = counters(S,N);
		/*for (int i = 0; i < N; i++) {
			System.out.println(counts[i][0]+" "+counts[i][1]+" "+counts[i][2]);
		}*/
		int cnt=0;
		for (int gap = 1; gap <= N-3; gap++) {
			for (int start = 0; start < N-gap; start++) {
				int middle = start+gap;
				if (S.charAt(start)!=S.charAt(middle)) {
					if (S.charAt(start)=='R'&&S.charAt(middle)=='G'||S.charAt(start)=='G'&&S.charAt(middle)=='R') {
						cnt+=counts[N-1][2]-counts[middle][2];
						if (middle+gap<N) {
							if (S.charAt(middle+gap)=='B'&& cnt>0) cnt--;
						}
					}
					if (S.charAt(start)=='R'&&S.charAt(middle)=='B'||S.charAt(start)=='B'&&S.charAt(middle)=='R') {
						cnt+=counts[N-1][1]-counts[middle][1];
						if (middle+gap<N) {
							if (S.charAt(middle+gap)=='G'&& cnt>0) cnt--;
						}
					}
					if (S.charAt(start)=='B'&&S.charAt(middle)=='G'||S.charAt(start)=='G'&&S.charAt(middle)=='B') {
						cnt+=counts[N-1][0]-counts[middle][0];
						if (middle+gap<N) {
							if (S.charAt(middle+gap)=='R'&&cnt>0) cnt--;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
	public static int[][] counters(String S, int N){ //1st slot = i; 2,3,4 slot = R,G,B cnt
		int[][] counts = new int[N][3];
		int cntR = 0;
		int cntG = 0;
		int cntB = 0;
		for (int i = 0; i < N; i++) {
			if (S.charAt(i)=='R') cntR++;
			if (S.charAt(i)=='G') cntG++;
			if (S.charAt(i)=='B') cntB++;
			counts[i][0]=cntR;
			counts[i][1]=cntG;
			counts[i][2]=cntB;
		}
		return counts;
	}
}