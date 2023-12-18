import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		double N=stdIn.nextDouble();
		double K=stdIn.nextDouble();
		double a=0;
		double z=1,y=0,x=0,w=1,k=(double)1/N;
		while(z<=N){
			if(z>=K)
				a+=k;
			else{
				x=z;
				while(true){
					x*=2;
					w*=(double)0.5;
					y++;
					if(x>=K)
						break;
				}
				a+=k*w;
			}
			w=1;
			z++;
		}
		System.out.println(a);
	}
}