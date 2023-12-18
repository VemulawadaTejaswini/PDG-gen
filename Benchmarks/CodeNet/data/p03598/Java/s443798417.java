import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int K = sc.nextInt();
   
   int sum = 0 ;
   int tmp = 0 ;
   for(int i=0;i<N;i++)
   {
     tmp = sc.nextInt();
     if(K-tmp<tmp) sum+=K-tmp;
     else sum+=tmp;
   }
   System.out.println(2*sum);
 }
}