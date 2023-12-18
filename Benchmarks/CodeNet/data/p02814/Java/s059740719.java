import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long M = sc.nextLong();
    long[] A = new long[N];
    long a = 0;
    long b = 0;
    long swap = 0;
    long r = 0;
    long x = 0;
    for(int i=0; i<N; i++){
    	A[i] =sc.nextLong();
    }
    long max = A[0]; //最小公倍数
    
    //最小公倍数を求める
    for(int i=1; i<N; i++){
      a = max;
      b = A[i];
      x = a * b;
      if (a < b){ swap = a; a = b; b = swap;}
      r = a % b;
      while(r!=0){
    		a = b;
   			b = r;
   			r = a % b;
  	  }
      max = x/b; 
    }
    if( max > M * 2 ) System.out.println(0);
    else{
      int ans = M / max + 1;
      System.out.println(ans);   
    }
  }
}
