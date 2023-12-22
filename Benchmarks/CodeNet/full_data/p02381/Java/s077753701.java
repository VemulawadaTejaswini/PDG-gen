import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat( "0.00000000 ");  
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int sum=0;
		double sum2=0;
		double a = 0;
	int n=sc.nextInt();
	if(n==0) {
		break;
	}
	int s[]=new int[n];
	for(int i=0;i<s.length;i++) {
		s[i]=sc.nextInt();
	}
	for(int i=0;i<s.length;i++) {
		sum=sum+s[i];
	}
	int m=sum/n;
	for(int i=0;i<s.length;i++) {
			a=(s[i]-m)*(s[i]-m);
			sum2=sum2+a;
	}
	double a2=sum2/n;
	double a3=(double) Math.sqrt(a2);
	System.out.println(df.format(a3));
}
}
}
