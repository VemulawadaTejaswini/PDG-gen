import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    int Max=-1,min=30000,sum=0,n,temp;
    Scanner in=new Scanner(System.in);
	
	n=in.nextInt();
	for(int i=0;i<n;i++)
	{
		temp=in.nextInt();
		if(temp>=Max)
			Max=temp;
		if(temp<=min)
			min=temp;
		sum+=temp;		
	}
	System.out.println(min + " " + Max + " " + sum);
    
  }

}