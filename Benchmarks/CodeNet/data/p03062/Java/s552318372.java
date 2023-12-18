import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    double[] a = new double[n];
    int un = 0;
    for(int i = 0;i<n;i++) {
      a[i] = stdIn.nextDouble();
      if(a[i]<0)  {
        un+=1;
        a[i] = (-1)*a[i];
    }
    double min = a[0];
    double k = 0;
    if(un%2==0)  k =addArray(a);
    if(un%2==1) {
      for(int i = 0;i<a.length;i++) {
      if(min>a[i]) min = a[i];
    }
    k = addArray(a);
    k = k - 2*min;
    }
    System.out.println(k);
  }
  static double addArray(double[] a) {
    double count = 0;
    for(int i = 0;i<a.length;i++) {
      count += a[i];
    }
    return count;
  }
}