
import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String args[])
{
	int j;
	//Scanner a = new Scanner(System.in);
	Scanner in = new Scanner(System.in);
	//System.out.println("ENter the list");
	int height[]=new int[10];
	int i;
	//int j;
	int x;
	for(i=0;i<10;i++)
	{
		height[i]=in.nextInt();
		
	}
	/*for(i=0;i<10;i++)
	{
		System.out.print(height[i]+ " ");
	}
	*/
for(i=0;i<10;i++)
{
	for(j=i+1;j<10;j++)
		if(height[i]>height[j])
		{
			int temp=height[i];
			height[i]=height[j];
			height[j]=temp;
		}
}
//System.out.println("Sorted");
for(i=9;i>6;i--)
{
	System.out.println(height[i]);
}
	

}
}