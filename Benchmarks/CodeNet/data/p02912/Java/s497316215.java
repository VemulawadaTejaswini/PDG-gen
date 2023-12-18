import java.util.*;

class Main {
	  static long mod=1_000_000_007;
  public static void main(String[] args) {
	  int flg = 0;
	  Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      long M = sc.nextLong();
      long[] a = new long[(int)N];
      long[] b = new long[(int)N];
      for (int i=0 ; i<N; i++) {
          b[i] = sc.nextLong();
      }
      quick_sort(b);
      for(int i=0;i<N;i++) {
    	  a[i]=b[(int)N-i-1];
      }
      
      int cnt;
      long tmp;
      for(int i=0;i<M;i++) {
    	  cnt=0;
    	  a[0]=a[0]/2;
    	  tmp = a[0];
    	  for(int j=1;j<N;j++) {
    		  if(a[j]>a[0]) {
    			  cnt++;
    		  }
    	  }
    	  
    	  for(int j=1;j<cnt+1;j++) {
    		  a[j-1]=a[j];
    	  }
    	  a[cnt]=tmp;
      }
      
      long ans=0;
      for(int i=0;i<N;i++) {
    	  ans = ans + a[i];
      }
      
      System.out.println(ans);
      
  }
  
  static void quick_sort(long[] d) {
	  quick_sort(d,0, d.length-1);
  }

  // dのleftからrightまでの間のデータ列をクイックソートする
  static void quick_sort(long[] d, int left, int right) {
      if (left>=right) {
          return;
      }
      long p = d[(left+right)/2];
      int l = left, r = right;
      long tmp;
      while(l<=r) {
          while(d[l] < p) { l++; }
          while(d[r] > p) { r--; }
          if (l<=r) {
              tmp = d[l]; d[l] = d[r]; d[r] = tmp;
              l++; r--;
          }
      }
      quick_sort(d, left, r);  // ピボットより左側をクイックソート
      quick_sort(d, l, right); // ピボットより右側をクイックソート
  }
}