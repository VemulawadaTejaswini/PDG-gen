import java.io.*;
class aoj1
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		int b;
		int hikaku;
		
		System.out.print("a");
		a=Integer.parseInt(br.readLine());
		System.out.print("b");
		b=Integer.parseInt(br.readLine());
		
		if(a>b)
			{
				System.out.print("a>b");
			}
		else if(a<b)
			{
				System.out.print("a<b");
			}
		else if(a==b)
			{
				System.out.print("a=b");
			}
	}
}