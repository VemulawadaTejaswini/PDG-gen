import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long N = sc.nextLong();
   long s1 = N;
   long s2 = 1;
   for(long i = (long)Math.abs(Math.sqrt(N));i>=1;i--)
   {
    	if(N%i==0) 
       	{
       	  	s1 = i;
         	s2 = N/s1;
     		break;
 		}
   }
   System.out.println(s1+s2-2);
 }
}