import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   long N = sc.nextInt();
   long A = sc.nextInt();
   long B = sc.nextInt();
   
   long tmp = N/(A+B);
   long ans = tmp * A;  
   long s = N%(A+B);
   
   if(s<=A) ans += s;
   else ans += A;
   System.out.print(ans);
 }
}