import java.util.*;
public class Main{

	
	  public static void main(String[] args)
	  {
	    Scanner sc=new Scanner(System.in);
	    int i=sc.nextInt();
	    int j=sc.nextInt();
	    int flag=0;
        if(j%2!=0)
        {
          System.out.println("No");
          return;
        }
	    if(i==1)
	    {
	    	if(j==4||j==2)
            {
	              System.out.print("Yes");
            }
	    }
	    else
	    {
	    for(int k=1;k<=i;k++)
	    {
	   
	      if(((k*2+(i-k)*4)==j)||((k*4+(i-k)*2)==j))
	      {
	        System.out.println("Yes");
	        flag=1;
	        break;
	      }  
	    } 
	    if(flag==0)
	    {
	      System.out.println("No");
	    }
	    }
	  }
	}  
