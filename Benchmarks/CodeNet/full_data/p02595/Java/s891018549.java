import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d = sc.nextLong();
    d *=d;
    long[] x = new long[n];
    long[] y = new long[n];
    long dis = 0;
    int count=0;
    for(int i = 0;i<n;i++){
      dis = 0;
      x[i] = sc.nextLong();
      y[i] = sc.nextLong();
      dis += x[i]*x[i];
      dis += y[i]*y[i];
      if(dis<=d){
        count++;
      }
    }
    System.out.println(count);
  }
}
