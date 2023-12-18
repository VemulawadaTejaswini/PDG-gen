import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   char[] c = sc.next().toCharArray();
   int[] h = new int[2];
   for(int i = 0;i<N;i++)
   {
     if(h[i]=='R') h[0]++;
     else h[1]++;
   }
   String ans;
   if(h[0]>h[1]) ans = "Yes";
   else ans = "No";
   System.out.println(ans);
 }
}