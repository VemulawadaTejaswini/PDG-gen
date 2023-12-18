import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		StringBuilder S2 = new StringBuilder(S);
		int div=0;
		int temp=0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='0') {
				if (temp==0) {
					div++;
					list.add(i);
				}
				temp=1;
			} else {
				temp=0;
			}
		}
		list.add(N);

		int max=0;
		int max_temp=0;
		int k_init=0;
		if (K>=div) {
			max=N;
		}
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='0') {
				break;
			}
			if (i==N-1) {
				max=N;
			}
		}
		if (max!=N) {
			for (int i=0;i<=div-K;i++) {
				int A=list.get(K+i+1)-list.get(i)-1;
				max=Math.max(A,max);
			//StringBuilder S1 = new StringBuilder(S2);
				//for (int j=0;j<K;j++) {
					/*
					for (int k=k_init;k<N;k++) {
						if (S1.charAt(k)=='0') {
							S1.setCharAt(k,'1');
						} else if (S.charAt(k)=='1') {
							if (k==0) {
							} else if (S.charAt(k-1)=='0') {
							k_init=k+1;
							break;
							}
						}
					}
					int temp1=0;
					for (int q=0;q<N;q++) {
						if (S1.charAt(q)=='1') {
							temp1++;
							max_temp=Math.max(temp1,max_temp);
						} else if(S1.charAt(q)=='0') {
							temp1=0;
						}
					}
					max=Math.max(max,max_temp);
					*/
				//}
			}
		}
		System.out.println(max);
	}
}