import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int q=scan.nextInt();
		while(q-->0)
		{
			long b=scan.nextLong();
			long c=scan.nextLong();
			long sum=0;
			for(int i=0;i<n;i++)
			{
				if(a[i]==b)a[i]=(int) c;	
				sum+=a[i];
			}
			System.out.println(sum);
		}
		
	}

}
