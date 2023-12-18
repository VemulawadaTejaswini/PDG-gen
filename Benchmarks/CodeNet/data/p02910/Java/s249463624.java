import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String N = sc.next();
   boolean flg = true;
   for(int i=0;i<N.length();i++)
   {
     if(i % 2 == 0)
     {
       if(N.charAt(i) == 'L') 
       {
         flg = false;
         break;
       }
     }
     else
     {
       if(N.charAt(i) == 'R') 
       {
         flg = false;
         break;
       }
     }
   }
   String SS= "Yes";
   if (!flg) SS ="No";
   System.out.println(SS);
 }
}