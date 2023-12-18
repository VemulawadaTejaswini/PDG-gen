
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long h=sc.nextLong();
		long w=sc.nextLong();
		long tmp1 = calc(h,w);
		long tmp2 = calc(w,h);
		long ans = tmp1;
		if(ans>tmp2) {
			ans=tmp2;
		}
		System.out.println(ans);
		sc.close();
	}

	private long calc(long h, long w) {
		long ans = Long.MAX_VALUE;
		if(h<3) return ans;
		for(long i=1; i<=h-2; i++) {
			long h1 = i;

			//case 1
			long h2 = (h-i)/2;
			long h3 = h-h1-h2;

			long s1 = h1*w;
			long s2 = h2*w;
			long s3 = h3*w;
			long tmp1 = sub(s1, s2, s3);

			//case 2
			h2 = (h-i);
			h3 = (h-i);
			long w1 = w;
			long w2 = w/2;
			long w3 = w-w2;
			s1 = h1*w1;
			s2 = h2*w2;
			s3 = h3*w3;
			long tmp2 = sub(s1,s2,s3);

			if(ans>tmp1) {
				ans=tmp1;
			}
			if(ans>tmp2) {
				ans=tmp2;
			}
		}
		return ans;
	}

	private long sub(long s1, long s2, long s3) {
		long min = s1;
		long max = s1;
		if(s2<min) {
			min = s2;
		}
		if(s3<min) {
			min = s3;
		}
		if(s2>max) {
			max = s2;
		}
		if(s3>max) {
			max = s3;
		}
		return max-min;
	}
}


