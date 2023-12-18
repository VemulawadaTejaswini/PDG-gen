import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();

   int ans = N/2;
   if(N%2==1) ans++;
   System.out.print(ans);
 }
}