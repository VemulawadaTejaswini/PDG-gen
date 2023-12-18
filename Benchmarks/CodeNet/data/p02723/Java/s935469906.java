import java.io.*;
import java.util.*;
import java.util.Scanner;
class coffee
{
  public static void main(String args[])throws IOException
  {
   String s; 
		Scanner sc = new Scanner(System.in);
 		//System.out.println("Enter a string"); 
 		s = sc.nextLine(); 
    if(s.length()==6)
    {
    if((s.charAt(2)==s.charAt(3)) &&(s.charAt(4)==s.charAt(5)))
       {
         System.out.println("Yes");
       }
       else
       {
         System.out.println("No");
       }
       }
       }
       }
                                                              
