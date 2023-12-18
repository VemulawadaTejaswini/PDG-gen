    import java.util.*;
	import java.lang.Math;
    public class Main
	{
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			int[] arr= new int[100];
			for(int i=0;i<a;i++)
			{
				arr[i]=arr[i]+b;
			}
			for(int i=0;i<a;i++)
			{
				System.out.print(""+arr[i]+"");
			}
			
		}
    }