import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		char[] M = new char[N];
		for(int i=0; i<N; i++) {
			M[i] = S.charAt(i);
		}

		int[] members = new int[N-1];
		for(int j=0; j<N-1; j++) {
			int k=0;
			while(k < j) {
				k++;
				if(M[k] == 'W') {
					members[j] ++;
				}
			}int l=N-2;
			while(l > j) {
				l--;
				if(M[l] == 'E') {
					members[j] ++;
				}
			}
		}

		int ans = S.length();
		for(int m=0; m<N-1; m++) {
			if(ans > members[m]) {
				ans = members[m];
			}
			System.out.println(members[m]);
		}

		System.out.println(ans);

	}

}
