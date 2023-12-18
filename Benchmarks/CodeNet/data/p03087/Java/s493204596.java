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
		int max = 0;
		int min = 100000;
		for(i=0; i<q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			if(l[i] < min) min = l[i];
			if(r[i] > max) max = r[i];
		}
		int[] sr = new int[n/2+1];
		int idx;
		int cnt;
		idx=min-1;i=0;
		int j;
		for(j=min-1; j <= max-2; j++) {
			if(s.charAt(j) == 'A') {
				if(s.charAt(j+1) == 'C') {
					sr[i++] = j++;
				}
			}
		}
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