import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int M = sc.nextInt();
   
   int[] Ai = new int[M];
   int K ;
   for(int i=0;i<N;i++)
   {
     K = sc.nextInt();
     for(int l = 0;l<K;l++)
     {
       Ai[sc.nextInt()-1]++;
     }
   }
   
   int count = 0;
   for(int i = 0;i<N;i++)
   {
     if(Ai[i]==N) count++;
   }
   System.out.println(count);
 }
}