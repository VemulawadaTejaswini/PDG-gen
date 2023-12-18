import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] l = new int[q];
		int[] r = new int[q];
		int i;
		for(i=0; i<q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		sc.close();
		sc = null;
		int idx;
		int cnt;
		StringBuilder s2;
		for(i=0; i<q; i++) {
			s2 = new StringBuilder(s.substring(l[i]-1, r[i]));
			idx=0;
			cnt=0;
			while((idx=s2.indexOf("AC", idx)) != -1) {
				cnt++;
				idx+=2;
			}
			System.out.println(cnt);
		}
	}
}