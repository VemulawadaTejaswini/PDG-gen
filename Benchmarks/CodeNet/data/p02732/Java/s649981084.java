import java.util.*;
import static java.lang.System.*;
import java.math.BigInteger;

import java.io.IOException;
import java.io.InputStream;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  long[]score = new long[N+1];
	  int[] k = new int[N+1];
	  //long sum = 0;
	  BigInteger sum = new BigInteger("0");
	  
	  for(int i=0; i<N; i++) {
		  int n = sc.nextInt();
		  score[n]++;
		  k[i+1] = n;
	  }
	  for(int i=1; i<=N; i++) {
		  //out.println("score[i]" +  score[i]);
		  if(score[i] > 1) {
			  long n = (score[i] * (score[i]-1)) / 2;
			  BigInteger big = new BigInteger(String.valueOf(n));
			  sum = sum.add(big);
		  }
		  //out.println(sum);
	  }
	  //out.println(sum);
	  for(int i=1; i<=N; i++) {
		  //long ans = sum - score[k[i]] + 1;
		  //out.println("scorek:"+(score[k[i]]-1));
		  BigInteger ki = new BigInteger(String.valueOf(score[k[i]] - 1));
		  BigInteger ans = sum.subtract(ki);
		  
		  //out.println("ans" +ans);
	  }

  }
}