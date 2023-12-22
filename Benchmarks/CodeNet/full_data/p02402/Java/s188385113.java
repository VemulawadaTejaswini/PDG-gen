import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		long sum=0;
		for(int i=0;i<n;i++){
			int x=scan.nextInt();
			if(x > max)max=x;
			if(x < min)min=x;
                        sum+=x;
		}
		
		System.out.printf("%d %d %d",min,max,sum);
		
	}
}
