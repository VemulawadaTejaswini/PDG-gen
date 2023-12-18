import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	double W=sc.nextDouble();
	double H=sc.nextDouble();
	double x=sc.nextDouble();
	double y=sc.nextDouble();
	
	double S1=H*x;
	double S2=H*(W-x);
	
	double K1=W*y;
	double K2=W*(H-y);
	
	double maxa;
	double maxb;
	
	if(S1>S2) {
		maxa=S2;
	}else {
		maxa=S1;
	}
	
	if(K1>K2) {
		maxb=K2;
	}else {
		maxb=K1;
	}
	
	if(maxa>maxb) {
		System.out.println(String.format("%.9f",maxa)+" "+0);
		
	}else if(maxa<maxb) {
		System.out.println(String.format("%.9f",maxb)+" "+0);
	}else if(maxa==maxb)
	
		System.out.println(String.format("%.9f",maxb)+" "+1);
		
	}
}



