import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String strN = scan.next();   
    int n = Integer.parseInt(strN);
    
    String s = "";
    int[] p = new int[n];
    
    for (int i = 0; i < n; i++) {
      s = scan.next();
      p[i] = Integer.parseInt(s);
    }
    
    for (int k = 0; k < n; k++) {
          if (p[k] > p[k+1]) {
            break;
          } else if (k == n - 1) {
            System.out.print("YES");
          }
    }
    
    int tmp = 0;
    
    for (int i = 0; i < n; i++) {
      tmp = p[i];
      
      for (int j = i; j < n; i++) {
        p[i] = p[j];
        p[j] = tmp;
        
        for (int k = 0; k < n; k++) {
          if (p[k] > p[k+1]) {
            break;
          } else if (k == n - 1) {
            System.out.print("YES");
          }
        }
      }
    }
    
    System.out.print("NO");
  }
}
