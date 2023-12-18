import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   char[] c = sc.next().toCharArray();
   
   int tmp = 0;
   int ans = 0;
   for(int i=0;i<N;i++)
   {
     if(c[i]=='I')
     {
       tmp++;
     }  
     else
     {
       tmp--;
     }
     if(tmp>ans) ans=tmp;
   } 
   System.out.println(ans);
 }
}