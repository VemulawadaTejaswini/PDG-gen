import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int[] a = new int[N];
   for(int i=0;i<N;i++) a[i]=sc.nextInt();
   
   int ans=100*100*100;
   int tmp=0;
   for(int i=-100;i<=100;i++)
   {
     tmp=0;
     for(int k=0;k<N;k++)
     {
       tmp+= (a[k]-i)*(a[k]-i);
     }
     if(tmp<ans) ans=tmp;
   }
   System.out.println(ans);
 }
}