import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long cnt=0L;
		for (int i=0;i<S.length()-2;i++) {
			int right=0;
			int left=0;
			if (S.charAt(i)=='A' && S.charAt(i+1)=='B' && S.charAt(i+2)=='C') {
				cnt++;
				int j=i-1;
				left=j+1;
				if (left==right) {
					cnt++;
				}
				while (j>0 && S.charAt(j)=='A'/*S.charAt(j)=='C' && S.charAt(j-1)=='B'*/) {
					cnt++;
					j--;
				}
				int k=i+3;
				right=k;
				while (k<S.length()-1 && S.charAt(k)=='B' && S.charAt(k+1)=='C'/*S.charAt(k)=='A'*/) {
					cnt++;
					k+=2;
				}
			}
		}
		System.out.println(cnt);
	}
}
