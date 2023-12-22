import java.util.Scanner;

public class itp_4_d {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int min=1000001;
		int max=-1000001;
		int sum=0;
		for(int i=0;i<n;i++){
			int x=scan.nextInt();
			if(x > max)max=x;
			if(x < min)min=x;
			sum+=x;
		}
		
		System.out.printf("%d %d %d\n",min,max,sum);
		
	}
}
