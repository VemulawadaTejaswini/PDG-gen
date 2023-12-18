import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long C = sc.nextLong();
		long x[] = new long[(int)N+1];
		long v[] = new long[(int)N+1];
		for(int i =1;i <=N;i++) {
			x[i]= sc.nextLong();
			v[i]= sc.nextLong();
		}

		boolean iscon =true;
		long nowx =0;
		long now =0;
		boolean right =true;
		long best =-1;
		long kal=0;
		while(iscon) {
			long max =0;
			long len =0;
			for(int i =1;i <=N;i++) {
				if(Math.abs(nowx-x[i])<Math.abs(C-nowx+x[i])) {
					right= true;
					len =nowx-x[i];
				}else {
					right=false;
					len =C-nowx+x[i];
				}
				//long len = Math.min(Math.abs(now-x[i]),Math.abs(C-now+x[i]));
				if(max<v[i]-len) {
					max = v[i]-len;
					best = i;
					nowx = x[i];
				}
			}
			if(max<0) {
				iscon =false;
				break;
			}
			if(right) {
				long i = now +1;
				while(i !=best) {
					kal+=v[(int)i];
					now = best;
					i++;
				}
			}else {
				long i = now -1;
				if(i==-1) {
					i = N;
				}
				while(i!=best) {
					kal+=v[(int)i];
					now = best;
					i--;
					if(i==-1) {
						i =N;
					}
				}
			}

		}
		sc.close();
	}
}
