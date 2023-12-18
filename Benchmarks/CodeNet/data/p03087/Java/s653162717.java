import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		int[] l = new int[Q];
		int[] r = new int[Q];
		for (int i=0;i<Q;i++) {
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}

		for (int i=0;i<Q;i++) {
			int cnt=0;
			String sub = S.substring(l[i]-1,r[i]);
				for (int j=0;j<sub.length();j++) {
					if (sub.charAt(j)=='A') {
						if (j!=sub.length()-1 && sub.charAt(j+1)=='C') {
							cnt++;
						}
					}
				}
			System.out.println(cnt);
		}
	}
}