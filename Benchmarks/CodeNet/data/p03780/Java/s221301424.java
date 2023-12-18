import java.util.Scanner;
import java.util.TreeSet;

public class Main{
  static int n, k;
  static int[] a;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    k = sc.nextInt();
    a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    int count = 0;
    for(int i = 0; i < n; i++){
      if(a[i] >= k){
        ++count;
      }
    }

    int[] b = new int[n - count];
    int m = 0;
    for(int i = 0; i < n; i++){
      if(a[i] < k){
        b[m++] = a[i];
      }
    }

    int ans = 0;
    for(int i = 0; i < m; i++){
      if(!check(i, b)){
        ++ans;
      }
    }

    System.out.println(ans);
  }

  private static boolean check(int index, int[] b){
    int[] c = new int[b.length - 1];
    int m = 0;
    for(int i = 0; i < b.length; i++){
      if(i != index){
        c[m++] = b[i];
      }
    }

    for(int i = 0; i < m; i++){
      if(c[i] >= k - b[index]){
        return true;
      }
    }

    if(m == 1){
      return false;
    }

    TreeSet< Integer > set = new TreeSet< >();
    for(int i = 0; i < m; i++){
      set.add(c[i]);
    }

    for(int i = 0; i < m; i++){
      set.remove(c[i]);
      Integer lb = set.lower(k - c[i]);
      if(lb != null){
        if(c[i] + lb >= k - b[index]){
          return true;
        }
      }
      set.add(c[i]);
    }

    return false;
  }
}