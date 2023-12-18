import java.util.*;
 public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] a = new int[100];
      int sum = 0;

      for(int i = 0;i < M;i++){
        a[i] = sc.nextInt();
      }

      for(int i = 0;i < M;i++){
         sum += a[i];
         if(sum > N){
            System.out.println(-1);
         }else{
            System.out.println(N - sum);
         }
      }
         
   }
 }