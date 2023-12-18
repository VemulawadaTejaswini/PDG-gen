import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		sc.close();

		int sub = Integer.MAX_VALUE;

		for(int i = 1; i <=H-2; i++) {
			int ra = i*W;
			int rb = ((H-i)/2)*W;
			int rc = (H-i-(H-i)/2)*W;

			int max = Math.max(Math.max(ra, rb), rc);
			int min = Math.min(Math.min(ra, rb), rc);

			if(max-min <= sub) sub = max-min;
		}

		for(int i = 1; i <= H-1; i++) {
			int ra = i*W;
			int rb = (H-i)*(W/2);
			int rc = (H-i)*(W-W/2);

			int max = Math.max(Math.max(ra, rb), rc);
			int min = Math.min(Math.min(ra, rb), rc);

			if(max-min <= sub) sub = max-min;
		}

		for(int i = 1; i <=W-2; i++) {
			int ra = H*i;
			int rb = H*((W-i)/2);
			int rc = H*(W-i-(W-i)/2);

			int max = Math.max(Math.max(ra, rb), rc);
			int min = Math.min(Math.min(ra, rb), rc);

			if(max-min <= sub) sub = max-min;
		}


		for(int i = 1; i <= W-1; i++) {
			int ra = H*i;
			int rb = (H/2)*(W-i);
			int rc = (H-H/2)*(W-i);

			int max = Math.max(Math.max(ra, rb), rc);
			int min = Math.min(Math.min(ra, rb), rc);

			if(max-min <= sub) sub = max-min;
		}

		System.out.println(sub);

//		if(H%3==0 || W%3==0) {
//			System.out.println(0);
//		}else {
//			int sub1 = Math.min(H, W);
//			long r1 = 0; long r2 = 0; long r3 = 0; long sub2 = Long.MAX_VALUE;
//			if(H>=W) {
//				for(int i = H-1; i >= 1; i--) {
//					r1 = i*W;
//				    r2 = W/2 * (H-i);
//				    r3 = (H-i) * (W-W/2);
//					long max = Math.max(Math.max(r1, r2), r3);
//					long min = Math.min(Math.min(r1, r2), r3);
//					if(max - min <= sub2) sub2 = max - min;
//				}
//			}else {
//				for(int i = W-1; i >= 1; i--) {
//					r1 = H*i;
//				    r2 = H/2 * (W-i);
//				    r3 = (H-H/2) * (W-i);
//					long max = Math.max(Math.max(r1, r2), r3);
//					long min = Math.min(Math.min(r1, r2), r3);
//					if(max - min <= sub2) sub2 = max - min;
//				}
//			}
//			System.out.println(Math.min(sub1, sub2));
//		}
	}

}
