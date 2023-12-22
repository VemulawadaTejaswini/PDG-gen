import java.util.*;
 
class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for (int i=0; i<n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    
    int count=0;
    for (int i=0; i*2<n; i++) {
      if (a[i]%2 == 1) count++;
    }
    System.out.println(count);
  }
}