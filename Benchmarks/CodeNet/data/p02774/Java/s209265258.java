import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());

    int[] s = new int[n*(n-1)/2];
    int[] a = new int[n];

    for (int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    int t=0;
    for(int i=0; i<n; i++){
      for (int j=i+1; j<n; j++){
        s[t++]  = a[i] * a[j];
      }
    }
    Arrays.sort(s);

    System.out.println(s[k-1]);
  }
}
