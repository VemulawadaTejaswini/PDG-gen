import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int N=input.nextInt(); //
		int K= input.nextInt(); //
		int count=0;
		int n1 = 0;
		int n2 = 0;			
			if(N%K==K*0.5)
			{
				n1++;
			}
			if(N%K==0)
			{
				n2++;
			}
			N--;
		count=n1*n1*n1+n2*n2*n2;
		System.out.println(count);
		input.close();
	}
}
