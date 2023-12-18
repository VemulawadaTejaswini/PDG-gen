import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long H = stdIn.nextInt();
		long W = stdIn.nextInt();
		long min = H*W;
		for(long i = 1; i <= H; i++) {
			for(long j = 1; j <= W; j++) {
				long S0 = i*j;
				if(i == H) {
					long S1 = (H/2)*(W-j);
					long S2 = (H-H/2)*(W-j);
					long S3 = H*((W-j)/2);
					long S4 = H*(W-j-(W-j)/2);
					
					long max1 = Math.max(Math.max(S0,S1),S2);
					long min1 = Math.min(Math.min(S0,S1),S2);
					long max2 = Math.max(Math.max(S0,S3),S4);
					long min2 = Math.min(Math.min(S0,S3),S4);
					
					if(Math.min(max1-min1,max2-min2) < min) min = Math.min(max1-min1,max2-min2);
				}
				else if(j == W) {
					long S1 = (H-i)*(W/2);
					long S2 = (H-i)*(W-W/2);
					long S3 = ((H-i)/2)*W;
					long S4 = (H-i-(H-i)/2)*W;
					
					long max1 = Math.max(Math.max(S0,S1),S2);
					long min1 = Math.min(Math.min(S0,S1),S2);
					long max2 = Math.max(Math.max(S0,S3),S4);
					long min2 = Math.min(Math.min(S0,S3),S4);
					
					if(Math.min(max1-min1,max2-min2) < min) min = Math.min(max1-min1,max2-min2);
				}
				else {
					long S1 = i*(W-j);
					long S2 = (H-i)*W;
					long S3 = (H-i)*j;
					long S4 = H*(W-j);
					
					long max1 = Math.max(Math.max(S0,S1),S2);
					long min1 = Math.min(Math.min(S0,S1),S2);
					long max2 = Math.max(Math.max(S0,S3),S4);
					long min2 = Math.min(Math.min(S0,S3),S4);
					
					if(Math.min(max1-min1,max2-min2) < min) min = Math.min(max1-min1,max2-min2);
				}
			}
		}
		
		System.out.println(min);

	}

}