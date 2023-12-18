import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] S = new int[N];
		for (int i=0;i<N;i++) {
			S[i]=sc.nextInt();
		}


		long kaijo=1;
		for (int i=1;i<=N;i++) {
			kaijo=kaijo*i%1000000007;
		}

		Arrays.sort(S);
		double[] dp = new double[X+1];
		for (int i=1;i<=X;i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j=0;j<N;j++) {
				if (S[j]<=i) {
					list.add(S[j]);
				}
			}
			if (list==null || list.size()==0) {
				dp[i]=i;
			}else {
				int n = list.size();
				double temp = 0;
				for (int j=0;j<n;j++) {
					temp=temp+dp[(i%list.get(j))];
				}
				dp[i]=temp/n;
			}
		}

		System.out.println((long)(dp[X]*kaijo%1000000007));
	}
}