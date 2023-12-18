import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();
   boolean b = false;
   
   for(int i = 1;i<=B;i++)
   {
     if(i*A%B==C)
     {
       b = true;
       break;
     }
   }
   String ans;
   if(b) ans = "YES";
   else ans = "NO";
   System.out.println(ans);     
 }
}