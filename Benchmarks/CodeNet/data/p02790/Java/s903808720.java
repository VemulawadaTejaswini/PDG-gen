    import java.util.*;
	import java.lang.Math;
    public class Main
	{
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			int[] arr1= new int[100];
			int[] arr2= new int[100];
			for(int i=0;i<a;i++)
			{
				arr1[i]=arr1[i]+b;
			}
			
			for(int i=0;i<b;i++)
			{
				arr2[i]=arr2[i]+a;
			}
			if(b<a){
			for(int i=0;i<a;i++)
			{
				System.out.print(""+arr1[i]+"");
			}
			}
			else{
			for(int i=0;i<b;i++)
			{
				System.out.print(""+arr2[i]+"");
			}
			}
		}
    }