import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long N = sc.nextLong();
 
   long tmp = N;
   long t2 =2;
   String ans ="";
   if(tmp==0) ans = "0";
   for(int i=0;i<33;i++)
   {
     if(tmp==0) break;
     if(tmp%t2!=0) 
     {
       if(i%2==1) tmp = tmp + t2/2;
       else tmp = tmp - t2/2;
       ans= "1"+ans;
     }
     else ans = "0"+ans;
     t2 *=2;
   }
   
   System.out.println(ans);   
 }
}