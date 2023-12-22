import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      long ans =0;
      long[] A = new long[N];
      long sum = 0;
      for(int i=0;i<N;i++){
        A[i] = sc.nextLong();
        sum+=A[i];
      }
      for(int i=0;i<N;i++){
        sum-=A[i];
        ans+=A[i]*sum;
        ans%=(1000000007);
      }
      System.out.println(ans);
    }
}