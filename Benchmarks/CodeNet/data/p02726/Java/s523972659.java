import java.io.*;
import java.lang.Math;
public class Main
{
  public static void main(String args[])throws Exception
  {
    int n,x,y,i,j;
    int one=0,two=0,three=0,min=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    n=Integer.parseInt(br.readLine());
    x=Integer.parseInt(br.readLine());
    y=Integer.parseInt(br.readLine());
    int arr[]=new int[n+1];
    for(i=1;i<=n;i++)
    {
      for(j=i+1;j<=n;j++)
      {
        one=j-i;
        two=Math.abs(x-i)+1+Math.abs(j-y);
		//System.out.println(two);
        three=Math.abs(y-i)+1+Math.abs(j-x);
		//System.out.println(two);
        if(one<=two && one<=three)
          min=one;
        else if(two<=one && two<=three)
          min=two;
        else
          min=three;
        arr[min]=arr[min]+1;
	  }
	}
	for(i=1;i<n;i++)
	{
		
			System.out.println(arr[i]);
	}
  }
}