import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		int[] temp=new int[arr.length];
		int tem;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
			temp[i]=arr[i];
		}
		
		for (int i = 0; i <arr.length; i++) 
        {
            for (int j = i + 1; j <arr.length; j++) 
            { 
                if (temp[i] > temp[j]) 
                {
                    tem = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tem;
                }
            }
        }
		
		int c=count(arr,temp);
		if(c>2) 
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("Yes");
		}
			
		
		input.close();
	}
	public static int count(int[] arr,int[] temp) 
	{
		int c=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]!=temp[j]) 
			{
				c++;
			}
		}
		return (c);
	}

}
