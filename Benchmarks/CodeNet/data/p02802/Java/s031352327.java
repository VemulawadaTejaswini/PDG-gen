import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int M = sc.nextInt();
   int[] p =new int[M];
   String[] s =new String[M];
   for(int i=0;i<M;i++) 
   {
     p[i] = sc.nextInt();
     s[i] = sc.next();
   }
   boolean[] ac = new boolean[100010]; 
   int ans =0;
   int wa =0;
   int qtmp =0;
   for(int i=0;i<M;i++)
   {
     if(s[i].equals("WA"))
     {
       if(!ac[p[i]])
       {
         wa++;
       }
     }
     if(s[i].equals("AC"))
     {
       if(!ac[p[i]])
       {
         ans++;
         ac[p[i]]=true;
       }
     }
   }
   System.out.println(ans+ " " + wa);
 }
}