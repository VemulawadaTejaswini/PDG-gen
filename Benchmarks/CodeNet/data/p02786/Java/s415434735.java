import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=1;
		long sum=0;
		while(n!=0) {
			n=n/2;
			sum=sum+c;
			c=c*2;
		}
		System.out.println(sum);  
		
	}
	
}