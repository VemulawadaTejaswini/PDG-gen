import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int T = sc.nextInt();
   int[] ti = new int[N];
   for(int i = 0;i<N;i++) ti[i] = sc.nextInt(); 
   
   int sum = 0;
   for(int i = 0;i<N;i++)
   {
     if(i==N-1) sum += T;
     else
     {
       if(ti[i+1]-ti[i] > T) sum += T;
       else sum += ti[i+1]-ti[i];
     }
   }
   System.out.println(sum);
 }
}