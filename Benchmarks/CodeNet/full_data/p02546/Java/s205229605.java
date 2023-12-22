import java.util.*;
class Main
{
	public static void main(String as[])
    {
		 int time;
      Scanner sc=new Scanner(System.in);
      	time=sc.nextInt();
      int a1[]=new int[time];
      int a2[]=new int[time];
      for(int i=0;i<time;i++)
      {
        a1[i]=sc.nextInt();
        a2[i]=sc.nextInt();        
      }
      int count=0;
      for(int i=0;i<time;i++)
      {
			if(a1[i]==a2[i])
            {
              count++;
              if(count==3)
                break;
            }
        	else
            {
              count=0;
            }
      }
      if(count==3)
      {
        System.out.println("Yes");
      }
      else
      System.out.println("No");
    }
}