import java.util.*;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int v = sc.nextInt();
    int p = sc.nextInt();
    Integer a[] = new Integer[n];
    for (int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    
    Arrays.sort(a, Collections.reverseOrder());
    long result = -1;
    
    long votePool = m * v;
    int low = 0;
    int high = n-1;
    int cur = (n-1)/2;
    long pVal = a[p-1];
    long votable = 0;
    while (low<=high) {
      
//      System.out.println(n + "-" + cur + low + high);
      if (cur<p) {
        if (Math.pow(high-low, 2)<=0) {
          result = cur;
          break;
        }
        else {
          low = cur+1;
          cur = (low + high) / 2;
          continue;
        }
      }
      
     // System.out.println(cur);
      if (pVal>a[cur]+m) {
        if (Math.pow(high-low, 2)<=0) {
          result = cur-1;
          break;
        }
        else {
          high = cur;
          if (low>1) {
            low--;
          }
          cur = (low + high) / 2;
          continue;
        }
      }
      
      votable = 0;
      votable += (p-1)*m;
      votable += (n-cur)*m;
      for (int i=p-1; i<cur; i++) {
        votable += a[cur]+m-a[i];
      }
      
      if (votable>=votePool) {
        if (Math.pow(high-low, 2)<=0) {
          result = cur;
          break;
        }
        else {
          low = cur+1;
          cur = (low + high) / 2;
          continue;
        }
      }
      else {
        if (Math.pow(high-low, 2)<=0) {
          result = cur-1;
          break;
        }
        else {
          high = cur;
          if (low>1) {
            low--;
          }
          cur = (low + high) / 2;
          continue;
        }
      }
    }
    
    System.out.println(result+1);
  }
}
