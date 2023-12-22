import java.io.*;
import java.util.*;
public class Main
{
 public static void main(String args[]) throws Exception
            {
 Scanner cin=new Scanner(System.in);
 int a,b;
 cin.useDelimiter("\n| ");
 while(cin.hasNext()){
	 a = cin.nextInt();
	 b = cin.nextInt();
	 int sum = a+b;
	 int count = 0;
	 while (sum>0){
		 sum = sum/10;
		 count++;
	 }
	 
	 System.out.println(count);
	 
 	
 }
       
            
            }
}