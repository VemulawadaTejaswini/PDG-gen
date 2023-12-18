import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0; i<n-1; i++){
      for(int j=i+1; j<n; j++){
        if(a[i] > a[j]){
          int w = a[i];
          a[i]  = a[j];
          a[j]  = w;
        }
      }
    }
    if(n==2){
      System.out.println(Math.abs(a[0] - a[1]));
      System.exit(0);
    }
    int sa_sum = 0;
    int base_c = a[0];
    int base_r = a[n-1];
    int base_l = a[n-2];
    sa_sum = base_r + base_l - base_c*2;
    for(int i=1; i<n-2; i++){
      int sa_r = Math.abs(a[i] - base_r);
      int sa_l = Math.abs(a[i] - base_l);
      if(sa_r > sa_l){
        sa_sum += sa_r;
        base_r = a[i];
      }
      else{
        sa_sum += sa_l;
        base_l = a[i];
      }
    }
    System.out.println(sa_sum);
  }
}