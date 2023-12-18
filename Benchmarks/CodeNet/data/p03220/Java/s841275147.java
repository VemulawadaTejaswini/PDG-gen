import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		double t=sc.nextDouble();
		int a=sc.nextInt();
		int h[]=new int [n];
		double tcand;
		int num=0;

		h[0]=sc.nextInt();
		tcand=Math.abs(a-(t-h[0]*0.006));

		for(int i=1;i<n;++i){
			h[i]=sc.nextInt();
			if (t-h[i]*0.006==a){
				num=i;
				break;
			}
			else if(Math.abs(a-(t-h[i]*0.006))<tcand){
				tcand=Math.abs(a-(t-h[i]*0.006));
				num=i;
			}
		}

		System.out.println(num+1);

	}
}