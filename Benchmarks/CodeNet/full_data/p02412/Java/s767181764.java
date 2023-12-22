import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int count=0;
		while(n!=0||x!=0)
		{
			for(int i=1;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					for(int k=j+1;k<=n;k++)
					{
						if((i+j+k)==x && (i!=j && i!=k && j!=k))
						{
							count++;
							//System.out.print(i+" "+j+" "+k);
						}
					}
				}
			}
			System.out.println(count);
			count=0;
			n = scan.nextInt();
			x = scan.nextInt();
		}
	}
}