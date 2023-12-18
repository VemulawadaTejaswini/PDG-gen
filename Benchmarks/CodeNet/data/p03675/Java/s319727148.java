import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		for(int i = 0 ; i<n ; i++)
		{
			a[i] = Integer.parseInt(scan.next());
			b[i] = a[i];

			//b[]のデータを前回データとしてc[]に入れとく
			for(int j=0; j<n ;j++){
				c[j]= b[j];
			}

			int count;
			count = i;
			//a,b,cを使って入れ替える
			for(int k=0; k<=i ;k++){
				b[k] =c[count];
				count--;
			}
		}
		for(int i = 0 ; i<=n-1 ; i++)
		{
			System.out.print(b[i]+"　");
		}
	}
}
