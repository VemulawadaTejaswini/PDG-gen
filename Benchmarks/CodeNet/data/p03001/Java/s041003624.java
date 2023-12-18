


import java.util.Arrays;
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
		
		double maxc;
		
		double k=y/x;
		double M1=W*(k*W)/2;
		double M2=W*H-M1;
		
		if(M1>M2) {
			maxc=M2;
		}else {
			maxc=M1;
		}
		
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
		
		double max=0;
		
		if(maxa>max) {
			max=maxa;
		}
		if(maxb>max) {
			max=maxb;
		}
		if(maxc>max) {
			max=maxc;
		}
		
		int index = 0;
		
		if(max==maxa) {
			index++;
		}
		if(max==maxb) {
			index++;
		}
		if(max==maxc) {
			index++;
		}
		
		int flag=0;
		
		if(index!=1) {
			flag=1;
		}
		
		System.out.println(String.format("%.81f",max)+" "+flag);
		
		
		
		
}
}
