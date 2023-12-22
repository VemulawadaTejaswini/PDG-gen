java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int A=new Integer(scan.next());
		int B=new Integer(scan.next());
		int H=new Integer(scan.next());
		int M=new Integer(scan.next());
		double shor=(H*60+M)*360/(12*60);
		double lon=6*M;
		double rad=shor-lon;
		if(lon<shor)
			rad=360-rad;
		double s=(A*A)+(B*B)-(2*A*B*Math.cos(Math.toRadians(rad)));
		System.out.println(Math.sqrt(s));
	}

}
