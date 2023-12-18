import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		int init_B=0;
		int last_A=0;
		int both_BA=0;
		int mid_AB=0;

		for (int i=0;i<N;i++) {
			s[i]=sc.next();
			int n=s[i].length();
			if (s[i].charAt(0)=='B') {
				init_B++;
			}
			if (s[i].charAt(n-1)=='A') {
				last_A++;
			}
			if (s[i].charAt(0)=='B' && s[i].charAt(n-1)=='A') {
				both_BA++;
			}

			for (int j=0;j<n-1;j++) {
				if (s[i].charAt(j)=='A' && s[i].charAt(j+1)=='B') {
					mid_AB++;
				}
			}
		}

		if (init_B==last_A && last_A==both_BA && both_BA>0) {
			init_B--;
		}
		System.out.println(Math.min(init_B,last_A)+mid_AB);
	}
}