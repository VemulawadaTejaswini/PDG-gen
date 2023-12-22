
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int count=0,che,N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();	
		}
		Arrays.sort(a);

		for(int i=0;i<N;i++)
		{
			che=0;
			for(int j=0;j<N;j++)
			{
				if(a[i] % a[j]==0&&i!=j)
				{
					che=1;
					break;	
				}
				
				
			}
				if(che==0)
				{count++;
				
				}
		}
		System.out.println(count);
	}

}