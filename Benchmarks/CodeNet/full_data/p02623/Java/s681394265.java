import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    
    int[] nbooks = new int[n];
    for(int i = 0; i<n; i++) {
      nbooks[i] = sc.nextInt();
    }

    int[] mbooks = new int[m];
    for(int i = 0; i<m; i++) {
      mbooks[i] = sc.nextInt();
    }

    long[] nbc = new long[n];
    nbc[0] = nbooks[0];
    for(int i = 1; i<n; i++) {
      nbc[i] = nbooks[i]+nbc[i-1];
      if(nbc[i] > k) break;
    }

    long[] mbc = new long[m];
    mbc[0] = mbooks[0];
    for(int i = 1; i<m; i++) {
      mbc[i] = mbooks[i]+mbc[i-1];
      if(mbc[i] > k) break;
    }
    
    int out = 0;
    
    for(int i = 0; i<n; i++) {
      for(int j = 0; j<m; j++) {
        if(nbc[i] + mbc[j] > k) break;
        else out = Math.max(out, i+j+2); 
      }
    }
    
    
    System.out.println(out);
  }
}
