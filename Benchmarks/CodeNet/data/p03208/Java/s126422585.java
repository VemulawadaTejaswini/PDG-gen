import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int K = sc.nextInt();
   int[] hi = new int[N];
   for(int i = 0;i<N;i++)
   {
    hi[i] = sc.nextInt();
   }
   Arrays.sort(hi);
   int ans = hi[N-1] - hi[N-K];
   System.out.println(ans);
 }
}