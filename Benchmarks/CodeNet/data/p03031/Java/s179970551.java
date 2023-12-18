import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] k = new int[M];
		int cnt=0;
		List<int[]> s = new ArrayList<int[]>();
		for (int i=0;i<M;i++) {
			k[i]=sc.nextInt();
			int[] S = new int[k[i]];
			for (int j=0;j<k[i];j++) {
				S[j]=sc.nextInt();
			}
			s.add(S);
		}
		int[] p = new int[M];
		for (int i=0;i<M;i++) {
			p[i]=sc.nextInt();
		}

		int[] stri=new int[N];
		for (int i=0;i<N;i++) {
			stri[i]=i+1;
		}
		for (int i=0;i<1<<N;i++) {
			int[] sw = new int[N];
			for (int j=0;j<N;j++) {
				if ((1&i>>j)==1) {
					sw[j]=1;
				}
			}

			loop:for (int j=0;j<M;j++) {
				int[] tmp=s.get(j);
				int sum=0;
				for (int l=0;l<k[j];l++) {
					sum+=sw[tmp[l]-1];
				}
				if (sum%2!=p[j]) {
					break loop;
				}
				if (j==M-1) {
					cnt++;
				}
			}
		}
	System.out.println(cnt);
	}
}