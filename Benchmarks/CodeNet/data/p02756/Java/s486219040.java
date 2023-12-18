import java.util.Scanner;
public class Main
{
	public static void main(String []args)
	{	
        Scanner sc = new Scanner(System.in);
       String res=sc.nextLine();
       int x=sc.nextShort();
        sc.nextLine();
       char arr[][]=new char[x][3];
        for(int i=0;i<x;i++)
        {
        	String temp=sc.nextLine();
        	arr[i][0]=temp.charAt(0);
        	if(arr[i][0] == '2')
        	{
        		arr[i][1]=temp.charAt(2);
        		arr[i][2]=temp.charAt(4);
        	}
        }
        stringForm(arr,res);
		
    }
	
 public static void stringForm(char arr[][],String result)
	{
		StringBuilder res=new StringBuilder (result); 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i][0]=='2')
			{
				if(arr[i][1]=='2')
				{
					res.append(arr[i][2]);
				}
				else
				{
					res.insert(0,arr[i][2]);
				}
			}
			else 
			{
				if((i+1<arr.length) && arr[i][0]==arr[i+1][0])
				{
					i++;
				}
				else
				{
				res.reverse();
				}
			}
		}
	
		System.out.print(res);
	}
	
	
}
