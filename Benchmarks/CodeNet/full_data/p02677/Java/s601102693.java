import java.util.Scanner;
import java.lang.Math;;
public class Main {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int H=scan.nextInt();
		int M=scan.nextInt();
		long shor=(H*60+M)*360/(12*60);
		long lon=6*M;
		long rad=shor-lon;
		if(lon<shor)
			rad=360-rad;
		double s=((A*A)+(B*B))-(2*A*B*Math.cos(Math.toRadians(rad)));
		System.out.println(Math.sqrt(s));
	}

}
