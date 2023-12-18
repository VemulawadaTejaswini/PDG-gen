import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		int c=0;
		a:for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(Math.abs(a[i]-a[j])<k)
				{
					c=1;
				}
				else
				{
					c=0;
					break a;
				}
			}
		}
		if (c==1) System.out.println("Yay!");
		else System.out.println(":(");
	}

}
