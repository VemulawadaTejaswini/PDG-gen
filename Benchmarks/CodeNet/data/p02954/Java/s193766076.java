import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		System.out.println(N);
		int R_index = 0;
		int L_index = 0;
		int now_R = 0;
		int even_count = 0;
		int odd_count = 0;
		int[] ans = new int[N];
		int len = 0;
		int R_first=0;

		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='R') {
				if (now_R==0) {
					// if ((i-R_index)%2==0) {
					// 	even_count++;
					// } else if((i-R_index)%2==1) {
					// 	odd_count++;
					// }
					len++;
				} else {
					now_R=0;
					// ans[L_index]+=even_count;
					// ans[R_index]+=odd_count;
					// odd_count=0;
					// even_count=1;
					if ((R_index-R_first)%2==0) {
						ans[R_index]+=len/2;
						if (len%2==1) {
							ans[R_index]++;
						}
						ans[L_index]+=len/2;
					} else {
						ans[L_index]+=len/2;
						if (len%2==1) {
							ans[L_index]++;
						}
						ans[R_index]+=len/2;
					}
					R_first=i;
					len=1;
				}
			} else if (S.charAt(i)=='L') {
				if (now_R==1) {
					// if ((i-L_index)%2==0) {
					// 	even_count++;
					// } else if((i-L_index)%2==1) {
					// 	odd_count++;
					// }
					len++;
				} else {
					now_R=1;
					R_index = i-1;
					L_index = i;
					len++;
					// if ((i-R_index%2)==0) {
					// 	ans[L_index]+=even_count;
					// 	ans[R_index]+=odd_count;
					// } else {
					// 	ans[L_index]+=odd_count;
					// 	ans[R_index]+=even_count;
					// }
					// odd_count=0;
					// even_count=1;
				}
			}
			if (i==N-1) {
				// ans[L_index]+=odd_count;
				// ans[R_index]+=even_count;
					if ((R_index-R_first)%2==0) {
						ans[R_index]+=len/2;
						if (len%2==1) {
							ans[R_index]++;
						}
						ans[L_index]+=len/2;
					} else {
						ans[L_index]+=len/2;
						if (len%2==1) {
							ans[L_index]++;
						}
						ans[R_index]+=len/2;
					}
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}