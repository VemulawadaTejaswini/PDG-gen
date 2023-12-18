import java.util.*;
class Main{
  public static void main(String args[])
  {
Scanner in=new Scanner(System.in);
	    String s=in.next();
	    int count=0;
	    for(int i=0;i<s.length();i++)
	    {
	      if(i+4<=s.length())
	         {
	             for(int j=i+4;j<s.length();j++)
	             {
	               String x=s.substring(i,j+1);
	               long v=Long.parseLong(x);
	               if(v%2019==0)
	                 count=count+1;
	             }
	         }
	      }
	    System.out.print(count);
	  }
	}