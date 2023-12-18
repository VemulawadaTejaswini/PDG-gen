import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Main
{
  public static void main(String args[])throws Exception
  {
   //String s; 
    int c=0;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();  
    for(int i=0;i<6;i++)
    {
      if(s.charAt(i)>=97 && s.charAt(i)<=122)
      {
        c=c+1;
      }
    }
    if(s.length()==6 && c==s.length())
    {
    	if((s.charAt(2)==s.charAt(3)) &&(s.charAt(4)==s.charAt(5)))
       		{
         		System.out.println("Yes");
       		}
       
    }
    else
       {
         System.out.println("No");
       }
   }
}
                                                              
