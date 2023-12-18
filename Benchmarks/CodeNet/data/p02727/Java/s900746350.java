import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		long[] p = new long[a], q=new long[b], r=new long[c];
		for(int i=0;i<a;i++) p[i]=sc.nextLong();
		for(int i=0;i<b;i++) q[i]=sc.nextLong();
		for(int i=0;i<c;i++) r[i]=sc.nextLong();
		sc.close();
		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);
		int p_cnt=a-x,q_cnt=b-y,r_cnt=c-1;
		while(true) {
			if(r_cnt<0) break;
			if(p_cnt>=a) {
				if(r[r_cnt]>q[q_cnt]){
					q[q_cnt]=r[r_cnt];
					q_cnt++;
					r_cnt--;
				}else break;
			}else if(q_cnt>=b) {
				if(r[r_cnt]>p[p_cnt]){
					p[p_cnt]=r[r_cnt];
					p_cnt++;
					r_cnt--;
				}else break;
			}else if(p[p_cnt]>q[q_cnt]) {
				if(r[r_cnt]>q[q_cnt]){
					q[q_cnt]=r[r_cnt];
					q_cnt++;
					r_cnt--;
				}else break;
			}else{
				if(r[r_cnt]>p[p_cnt]){
					p[p_cnt]=r[r_cnt];
					p_cnt++;
					r_cnt--;
				}else break;
			}
		}
		long ans = 0;
		for(int i=a-x;i<a;i++) ans += p[i];
		for(int i=b-y;i<b;i++) ans += q[i];
		System.out.println(ans);
	}
}