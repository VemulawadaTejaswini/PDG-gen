import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int min=1000000;
		int max=0;
		long sum=0;

		for(int i=0;i<N; i++){
			int a=sc.nextInt();
			if(a<=min) {
				min=a;
			}
			if(a>max) {
				max=a;
			}
			sum+=a;		
		}
		System.out.printf("%d %d %d\n",min,max,sum);
	}


}
