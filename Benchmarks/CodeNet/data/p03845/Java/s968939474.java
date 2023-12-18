import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int t = new int[N];
   int sum = 0;
   for(int i=0;i<N;i++) 
   {
     t[i] = sc.nextInt();
     sum += t[i];
   }
   int M = sc.nextInt();
   
   int p;
   int x;
   int tmp = sum;
   for(int i=0;i<M;i++) 
   {
     p = sc.nextInt();
     x = sc.nextInt();
     tmp = sum;
     
     tmp += x-t[p-1];
     System.out.println(tmp);
   }
 }
}