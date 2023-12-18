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
    int result = 0;
    int defaultMin = 0;
    for (int i=0; i<n; i++) {
      if (i<p) {
        result++;
        defaultMin = a[i];
        continue;
      }
      
      if (a[i]==defaultMin) {
        result++;
        continue;
      }
      
      if ((n-i)>v) {
        result++;
        continue;
      }
      
      
      if (defaultMin>a[i]+m) {
        continue;
      }
      
      if ((v-(n-i))<p) {
        result++;
        continue;
      }
      
      // 選択し入りに影響しない上位に入れた後のことを考える。
      int restV = v-(n-i)-(p-1);
      int poolVotes = restV * m;
      
      for (int j=p-1; j<n-i; j++) {
        if (i==j) {
          continue;
        }
        int tmp=a[j];
        if (tmp<a[i]+m) {
          int count = 0;
          while (tmp+1<a[i]+m) {
            poolVotes--;
            tmp++;
            count++;
            if (count==m) {
              continue;
            }
          }
        }
      }
      if (poolVotes<=0) {
        result++;
      }
      
    }
 
    
    System.out.println(result);
  }
}
