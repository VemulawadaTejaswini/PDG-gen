import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a;
		int dp[][]=new int[n][20];
		for(int i=0;i<n;i++) {

			a=sc.nextInt();
			for(int j=0;j<20;j++) {
				dp[i][j]=(int)a%2;
				a=a/2;
			}
		}
		System.out.print(bundan(0, 0, n, dp, n));

	}

	public static long bundan(int keta, int start, int end, int[][] dp, int n) {

		long sum=0;
		ArrayList<Integer> st =new ArrayList<Integer>();
		st.add(start);

		for(int i=0;i<end;i++) {
			if(dp[keta][i]==1) {
				st.add(i);
			}
		}
		st.add(end);

		if(keta<20) {
			if(st.size()>2) {
				for(int i=0;i<st.size()-2;i++) {
					sum+=bundan(keta++, st.get(i)+1, st.get(i+2)-1, dp, n);
				}
			}
			else {
				sum=bundan(keta++, start, end, dp, n);
			}
		}
		else {
			if(st.size()>2) {
				for(int i=0;i<st.size()-2;i++) {
					int hoge=st.get(i+2)-st.get(i);
					sum+=hoge*(hoge+1)/2;
				}
			}
			else {
				int hoge=end-start;
				sum=hoge*(hoge+1)/2;
			}

		}

		return sum;
	}

}
