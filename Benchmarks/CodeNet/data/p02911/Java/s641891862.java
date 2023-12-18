import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    
    int[] a = new int[n];
    int[] b = new int[q];
    
    for(int i = 0; i < n; i ++ ) {
      a[i] = k;
    }
    
    for(int j = 0; j < q; j ++ ) {
      b[j] = sc.nextInt();
    }
    
    for(int j = 0; j < q; j ++ ) {
      a[b[j]-1] ++;
    }
 
    for(int i = 0; i < n; i ++) {
      if(a[i] > q-k) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
    
  }
}