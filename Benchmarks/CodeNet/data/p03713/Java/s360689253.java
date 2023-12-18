import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long H=sc.nextLong();
		long W=sc.nextLong();
		
		if(H%3==0||W%3==0) {
			System.out.println(0);
			return;
		}
		long S[]= {0,0,0};
		long d=H*W;
		
		for(long i=1;i<H;i++) {
			S[0]=W/2*i;
			S[1]=(W-W/2)*i;
			S[2]=W*(H-i);
			Arrays.sort(S);
			d=Math.min(d, S[2]-S[0]);
		}
		for(long i=1;i<W;i++) {
			S[0]=H/2*i;
			S[1]=(H-H/2)*i;
			S[2]=H*(W-i);
			Arrays.sort(S);
			d=Math.min(d, S[2]-S[0]);
		}
		
		System.out.println(d);
	}
}
