import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] h = new int[N];
   boolean b = true;

   for(int i = 0;i<N;i++)
   {
     h[i]=sc.nextInt();
   }
   
   if(h[0]-2>=h[1]) b = false;
   for(int i =1;i<N-1;i++)
   {
     if(h[i-1]-2>=h[i]) b = false;
     else if(h[i]==h[i+1]+1 && h[i-1]>=h[i]) b = false;
     if(!b) break;
   }
   
   String ans;
   if(b) ans = "Yes";
   else ans = "No";
   System.out.println(ans);
 }
}