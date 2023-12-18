import java.util.*;
class Main {
  Scanner sc = new Scanner(System.in);
  int n = Integer.parseInt(sc.next());
  int[] w = new int[n];
  for(int i=0; i<n; i++) {
    w[i] = Integer.parseInt(sc.next());
  }
  
  public static void main(String[] args) {
    int s1 = 0;
 	int s2 = 0;
    int diff = 200;
    
    for (int i=0; i<n; i++) {
      for (int j=0; j<=n; j++) {
        s1 += w[j];
      }
      for (int k=i+1; k<n; k++) {
        s2 += w[k];
      }
      if (Math.abs(s1-s2) < diff) {
        diff = Math.abs(s1-s2);
      }
      s1 = 0;
      s2 = 0;
    }
    
    System.out.println(diff);
  }
  
}
