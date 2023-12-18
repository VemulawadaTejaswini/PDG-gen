import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int A = sc.nextInt();
   
   int ans = H/A +1;
   if(H%A==0) ans-=1;
   System.out.println(ans);
 }
}