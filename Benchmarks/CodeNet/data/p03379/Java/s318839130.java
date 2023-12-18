import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] x = new long[n];
    long[] y = new long[n];
    for(int i = 0;i<n;i++){
      x[i] = sc.nextLong();
      y[i] = x[i];
    }
    Arrays.sort(x);

    if(x[n/2]==x[n/2-1]){
      for(int i = 0;i<n;i++){
        System.out.println(x[n/2]);
      }
      return;
    }

    for(long a:y){
      if(a<x[n/2]){
        System.out.println(x[n/2]);
      }else{
        System.out.println(x[n/2-1]);
      }
    }
  }
}
