import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int Q = sc.nextInt();
   char[] S = sc.next().toCharArray();
   
   int l;
   int r;
   int ans=0;
   for(int i=0;i<Q;i++)
   {
     ans =0;
     l=sc.nextInt();
     r=sc.nextInt();
     
     for(int k=l-1;k<r-1;k++)
     {
       if(S[k]=='A'&&S[k+1]=='C') ans++;       
     }
     System.out.println(ans);
   }
 }
}