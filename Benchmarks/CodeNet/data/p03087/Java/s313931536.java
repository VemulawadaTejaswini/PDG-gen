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
		int[] sr = new int[n/2];
		int idx;
		int cnt;
		StringBuilder s2 = new StringBuilder(s);
		idx=0;i=0;
		while((idx=s2.indexOf("AC", idx)) != -1) {
			sr[i]=idx;
			idx+=2;
			i++;
		}
		int j;
		sr[i]=-1;
		for(i=0; i<q; i++) {
			cnt=0;
			j=0;
			while(sr[j] != -1) {
				if(sr[j]>=l[i]-1) {
					if(sr[j]<=r[i]-2) cnt++;
					else break;
				}
				j++;
			}
			System.out.println(cnt);
		}
	}
}