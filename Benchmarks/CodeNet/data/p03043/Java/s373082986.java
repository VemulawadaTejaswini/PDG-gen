import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int K = sc.nextInt();
	double[] persentList  = new double[N+1]; //各数字ごとの勝利率
	  double sum = 0;
	  int k = K;

	  //1回目で勝ち確定
	  if(N >= K) {
	  for(int i = K; i<=N; i++) 
		  persentList[i] = 1;
	  } else {
		  k = N;
	  }
	  
	  //それ以外
	  for(int i=1; i<=k; i++) {
		  double persent = 1;
		  int count = 0;
		  int n = i;
		  while(n < K) {
			  n *= 2;
			  count++;
		  }
		  for(int j=0; j<count; j++) {
			  persent /= 2;
		  }
		  persentList[i] = persent;
		  
	  }
	  for(int i=1; i<=N; i++) {
		  sum += persentList[i];
	  }
	  
	  double ans = sum  / N;
	  out.println(ans);
	  		  
	}
  }	