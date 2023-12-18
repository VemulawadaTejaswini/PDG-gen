import java.util.*;

public class Main{

  static int check(int k, int n, int[]a){
    int t=0;

    for(int i=0; i<k; i++){

      for(int j=i+1; j<n; j++){
        if(j == k) j++;
        if(j == n) break;
        if(a[i]==a[j])
          t++;
      }
    }

      for(int i=k+1; i<n-1; i++){

      for(int j=i+1; j<n; j++){
        if(j == k) j++;
        if(j == n) break;
        if(a[i]==a[j])
           t++ ;    
      }
    }
    return t;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());

    int[] a = new int[n];

    for(int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
    }

    for(int i=0; i<n; i++)
      System.out.println(check(i, n, a));

  }
}
