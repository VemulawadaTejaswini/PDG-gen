import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());

    int m = Integer.parseInt(sc.next());

    int[] a = new int[n];

    int[] s = new int[m];
    int[] c = new int[m];

    for(int i=0; i<m; i++){
      s[i] = Integer.parseInt(sc.next())-1;
      c[i] = Integer.parseInt(sc.next());
    }

    for (int i=0; i<m; i++){
      if (a[s[i]] == 0)
      a[s[i]] = c[i];
      else if (a[s[i]] != c[i]){
        System.out.println(-1);
        break;
      }
      if (s[i] == 0 && c[i] == 0){
        System.out.println(-1);
        break;
      }


      if (i==m-1){
        if (a[0] == 0)
          a[0] = 1;
        for (int j=0; j<n; j++){
          System.out.print(a[j]);
        }
      }
    }

    if (n == 1 && a[0] == 0){
      System.out.println(0);
    }else if (m==0){
      a[0] = 1;
      for (int j=0; j<n; j++){
        System.out.print(a[j]);
      }
    }
  }
}
