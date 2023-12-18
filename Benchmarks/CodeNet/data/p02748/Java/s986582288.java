import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();
    int a[] = new int[A];
    int b[] = new int[B];
    int m[] = new int[M];
    int x;
    int y;
    int c;
    
    for(int i=0; i<A; i++) {
      a[i] = sc.nextInt();
    }
    for(int j=0; j<B; j++) {
      b[j] = sc.nextInt();
    }
    
    for(int k=0; k<M; k++) {
      x = sc.nextInt();
      y = sc.nextInt();
      c = sc.nextInt();
      m[k] = a[x-1] + b[y-1] - c;
    }
    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(m);
    if(m[0]<=a[0]+b[0]) {
      System.out.println(m[0]);
    } else {
      System.out.println(a[0] + b[0]);
    }
  }
}