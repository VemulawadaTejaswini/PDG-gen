import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double hp=sc.nextDouble();
		double hat=0;
		double at=0;
		double[] x=new double[n];
		double sum=0;
		for(int i=0;i<n;i++){
			double a=sc.nextDouble(),b=sc.nextDouble();
			if(a>hat)
				hat=a;
			x[i]=b;
		}
		for(int i=0;i<n;i++){
			if(x[i]>=hat){
				sum++;
				hp-=x[i];
			}
		}
		if(hp/hat%1>0){
			sum+=hp/hat+1;
		}else
			sum+=hp/hat;
		System.out.print((int)sum);
	}
}
