import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		long H = sc.nextLong();
		long W = sc.nextLong();
		sc.close();

		long D = H*W;

		if(D%3 == 0){
			System.out.println("0");
		}
		else{
			long ans1 = 100000000001l;
			long ans2 = 100000000001l;
			for(long i = 1 ; i <= H-1 ; i++){
				long s1 = i * W;
				long s2 = (H-i) * (W/2);
				long s3 = (H-i) * (W-(W/2));

				long smin = Math.min(Math.min(s1, s2),s3);
				long smax = Math.max(Math.max(s1, s2),s3);

				ans1 = Math.min(ans1, smax-smin);

			}
			for(long i = 1 ; i <= W-1 ; i++){
				long t1 = H * i;
				long t2 = (H/2) * (W-i);
				long t3 = (H-(H/2)) * (W-i);

				long tmin = Math.min(Math.min(t1, t2),t3);
				long tmax = Math.max(Math.max(t1, t2),t3);

				ans2 = Math.min(ans2, tmax-tmin);
			}
			//System.out.println(ans1 + " " + ans2);
			System.out.println(Math.min(ans1, ans2));
		}
	}
}
