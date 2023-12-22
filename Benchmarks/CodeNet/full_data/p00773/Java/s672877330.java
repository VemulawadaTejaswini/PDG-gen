
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			double x=sc.nextInt(),y=sc.nextInt(),n=sc.nextInt();
			if(x==0)break;
			x= (100+x)/100;
			y=(100+y)/100;
			int max=0;
			for(int i=1;i<n;i++) {
				for(int j=1;j<n;j++) {
					if((int)(i*x)+(int)(j*x)==n) 
						max =Math.max(max,(int)(i*y)+(int)(j*y));
				}
			}
			System.out.println(max);
			
			
		}
		sc.close();
	}

}

