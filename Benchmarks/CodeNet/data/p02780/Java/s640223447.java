import java.util.*;
public class Main{
  public static void main(String []args){
  Scanner sc = new Scanner(System.in);

  int n = sc.nextInt();
  int k = sc.nextInt();
  int[] p  =new int[n];
  double exp[] = new double[n];
  double data[] = new double[n];

  for (int i = 0;i<n ;i++ ) {
    p[i] = sc.nextInt();
    exp[i] = (double)(1+p[i])/2;
  }

  data[0]=exp[0];
  for (int i = 1;i<n ;i++ ) {
    data[i] = data[i-1]+exp[i];
  }

  int t = 0;
  double max = data[k-1];
  for (int i = k;i<n ;i++ ) {
    max = Math.max(max,data[i]-data[t]);
    t++;
  }
  System.out.println(max);


}
}
