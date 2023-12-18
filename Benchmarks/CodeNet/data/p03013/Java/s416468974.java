import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int M = sc.nextInt();
	  /*int[] a = new int[M];
	  for(int i=0; i<M;i++)
		  a[i] = sc.nextInt();*/
	  List<Integer> a = new ArrayList<>();
	  for(int i=0; i<M; i++)
		  a.add(sc.nextInt());
	  int[] DP = new int[N + 1]; //動的計画法
	  DP[0] = 1;
	  if(! a.contains(1))DP[1] = 1;
	  else DP[1] = 0;
	  
	  for(int i=2; i<=N; i++) {
		  if ( a.contains(i) ) DP[i] = 0;
		  else {
			  DP[i] = DP[i-1] + DP[i-2];
		  }
	  }
	  out.println(DP[N] % 1000000007);
  }
}