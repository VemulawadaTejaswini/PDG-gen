import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a[] = new long[n];
    long ans = 1;
    for(int i=0 ; i<n ; i++){
      a[i] = sc.nextLong();
    }
    for(int i=0 ; i<n ; i++){
      ans = ans*a[i];

    }
    long x = (long)Math.pow(10,18);
    // System.out.println(x);

    if(ans<=x){
      System.out.println(ans);
    }else{
      System.out.println(-1);
    }

  }
}
