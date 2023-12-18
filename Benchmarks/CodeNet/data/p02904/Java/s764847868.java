import java.lang.*;
import java.util.*;

public class Main {
public static void main(String[] args) {
  Scanner stdIn = new Scanner(System.in);
  int n = stdIn.nextInt();
  int k = stdIn.nextInt();
  int count = 0;
  int[] p = new int[n];
  for(int i = 0; i < n; ++i) {
    p[i] = stdIn.nextInt();
  }
  
  for(int i = 0; i < n - k + 1; i++) {
    int[] r = new int[k];
    int[] q = new int[n];
    for(int j = 0; j < k; j++) {
      r[j] = p[i + j];
    }
    
    for(int j = 0; j < n; j++) {
      q[j] = p[j];
    }

    Arrays.sort(r);
      
  	for(int j = 0; j < k; j++) {
      q[i + j] = r[j];
    }
    for(int j = 0; j < n; j++) {
      if(p[j] != q[j] || i == 0) {
        ++count;
        for(int l = 0; l < n; l++) {
          p[l] = q[l];
        }
        break;
      }
    }
  }
  
  System.out.println(count);
}
}