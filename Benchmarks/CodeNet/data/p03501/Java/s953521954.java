import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int T = sc.nextInt();
   int B = sc.nextInt();
 

   if(N*T>=B)System.out.println(B);
   else System.out.println(N*T);
 }
}