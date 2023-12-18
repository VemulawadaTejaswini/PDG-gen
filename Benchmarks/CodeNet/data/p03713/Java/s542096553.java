import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.close();

		long D = H*W;

		if(D%3 == 0){
			System.out.println("0");
		}
		else{
			long s1 = H*(W/2);
			long s2 = (H/2) * (W-(W/2));
			long s3 = (H-(H/2)) * (W-(W/2));

			long smin = Math.min(Math.min(s1, s2),s3);
			long smax = Math.max(Math.max(s1, s2),s3);


			long t1 = (H/2)*W;
			long t2 = (H-(H/2)) * (W/2);
			long t3 = (H-(H/2)) * (W-(W/2));

			long tmin = Math.min(Math.min(t1, t2),t3);
			long tmax = Math.max(Math.max(t1, t2),t3);


			System.out.println(Math.min(smax-smin, tmax-tmin));

		}



	}
}
