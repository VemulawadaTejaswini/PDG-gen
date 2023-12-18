import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		long r[]=new long[n];
		r[0]=a[0];
		long cnt1=0;
		if(r[0]>=0) {
			cnt1+=Math.abs(-1-r[0]);
			r[0]=-1;
		}
		for(int i=1;i<n;i++) {
			r[i]=r[i-1]+a[i];
			if(i%2==1&&r[i]<=0) {
				cnt1+=Math.abs(1-r[i]);
				r[i]=1;
			}
			if(i%2==0&&r[i]>=0) {
				cnt1+=Math.abs(-1-r[i]);
				r[i]=-1;
			}
		}
		r=new long[n];
		r[0]=a[0];
		long cnt2=0;
		if(r[0]<=0) {
			cnt2+=Math.abs(1-r[0]);
			r[0]=1;
		}
		for(int i=1;i<n;i++) {
			r[i]=r[i-1]+a[i];
			if(i%2==1&&r[i]>=0) {
				cnt2+=Math.abs(-1-r[i]);
				r[i]=-1;
			}
			if(i%2==0&&r[i]<=0) {
				cnt2+=Math.abs(1-r[i]);
				r[i]=1;
			}
		}
		System.out.println(Math.min(cnt1, cnt2));
	}
}