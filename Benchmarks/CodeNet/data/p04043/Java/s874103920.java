import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		boolean arr[]=new boolean[10];
		for(int i=0;i<k;i++)
		{	
			int d=sc.nextInt();
			arr[d]=true;
		}
		boolean find=true;
		for(int x=n; ;x++)
		{
			find=true;
			for(int y=x;y>0;y=y/10)
			{
				int r=y%10;
				if(arr[r])
				{
					find=false;
					break;
				}
			}
			if(find==true)
			{
				System.out.println(x);
				return;
			}
		}
			

	}

}
