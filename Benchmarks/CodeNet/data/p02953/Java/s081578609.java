import java.util.*;
public class Main {
public static void main(String args[])
{
  Scanner sp=new Scanner(System.in);
    int n=sp.nextInt();
    int ar[]=new int[n];
    int sc=0;
    int sn=0;
    for(int i=0;i<n;i++)
    {
      ar[i]=sp.nextInt();
    }

    for(int i=0;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(ar[i]<ar[j])
        {
          sc++;
        }
        else{
          sn++;
        }
      }      
    }
    if(sc<sn)
    {
      System.out.print("NO");
    }
    else
    {
      System.out.print("Yes");
    }
}
}
	
	
	
