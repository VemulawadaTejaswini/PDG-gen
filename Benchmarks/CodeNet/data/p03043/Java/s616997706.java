import java.util.*;
public class Main{
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	double n=sc.nextDouble();
	double k=sc.nextDouble();
	double s=0;
	double c=0;
	if(n>k)
		c=k;
	else c=n;
	for(int i=1;i<=c;i++){
		int m=1;
		int e=i;
		while(true){
		e=e*2;
			if(e>=k)
				break;
			m++;
		}
		s=s+Math.pow(.5,m);
	}
	s=s*Math.pow(n,-1);
	if(n>k){
    double d=(n-k)*Math.pow(n,-1);
		s+=d;
	}
	System.out.println(s);
}
}