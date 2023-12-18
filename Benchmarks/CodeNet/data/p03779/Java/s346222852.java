import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int X = sc.nextInt();
   int t =1;
   while(t*(t+1)/2 <X)
   {
     t++;
   }
   System.out.println(t);
 }
}