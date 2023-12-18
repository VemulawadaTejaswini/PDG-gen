import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		long n,m;
		long sum;
		n=cin.nextInt();
		m=cin.nextInt();
		
		if((n==1)||(m==1)) {
			sum=1;
		}
		else {
			if((n*m)%2!=0)
			{
				long x=(int)Math.floor((n*m)/2);
				sum=x+1;
			}
			else
			{
				sum=(n*m)/2;
			}
		}
		System.out.println(sum);
		cin.close();
	}

}
