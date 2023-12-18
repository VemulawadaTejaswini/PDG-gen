import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    int c[] = new int[n];
    int nnn = 3 * n;
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    for(int i = 0;i<n;i++){
      b[i] = sc.nextInt();
    }
    Arrays.sort(b);
    for(int i = 0;i<n;i++){
      c[i] = sc.nextInt();
    }
    Arrays.sort(c);

    //配列をソートしただけやからこっからがんばれな

  }
}
