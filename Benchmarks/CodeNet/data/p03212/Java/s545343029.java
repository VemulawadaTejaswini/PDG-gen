import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int S_N = Integer.parseInt(S);
		int N = S.length();
		int[] nums = {3, 5, 7, 0};
		int cnt=0;

		String[] str_array = new String[(int)Math.pow(4,N)];
		for (int i=0;i<Math.pow(4,N);i++) {
			int[] array = new int[N];
			for (int j=0;j<N;j++) {
				int tmp = i;
				for (int k=0;k<j;k++) {
					tmp/=4;
				}
				array[j] = tmp%4;
			}
			for (int j=0;j<N;j++) {
				str_array[i]+=String.valueOf(nums[array[j]]);
			}
			str_array[i]=str_array[i].replace("null","");
			int ans = Integer.parseInt(str_array[i]);

			int[] flag = new int[5];
			for (int j=0;j<N;j++) {
				char number = str_array[i].charAt(j);
				if (number=='3') {
					flag[0]=1;
					flag[4]=1;
				} else if (number=='5') {
					flag[1]=1;
					flag[4]=1;
				} else if (number=='7') {
					flag[2]=1;
					flag[4]=1;
				} else if (number=='0') {
					if (flag[4]==1) {
						flag[3]=1;
					}
				}
			}
			if (flag[0]==1 && flag[1]==1 && flag[2]==1 && flag[3]==0) {
				if (ans<=S_N) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}