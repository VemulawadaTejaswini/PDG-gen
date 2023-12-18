import java.util.*;

class Main {
	  static long mod=1_000_000_007;
  public static void main(String[] args) {
	  int flg = 0;
	  Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      long K = sc.nextLong();
      long Q = sc.nextLong();
      long[] a = new long[(int)N];
      int tmp;
      
      for(int i=0;i<Q;i++) {
    	  tmp = sc.nextInt()-1;
    	  a[tmp] = a[tmp] +1;
      }

      for(int i=0;i<N;i++) {
    	  if(a[i]>Q-K) {
    		  System.out.println("Yes");
    	  } else {
    		  System.out.println("No");
    	  }
      }
      
  }