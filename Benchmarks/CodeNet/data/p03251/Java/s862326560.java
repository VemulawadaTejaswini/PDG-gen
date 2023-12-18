import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int xx = sc.nextInt();
    int yy = sc.nextInt();
    if(xx>=yy){
      System.out.println("War");
      return;
    }
    int[] x = new int[n+1];
    int[] y = new int[m+1];
    x[0] = xx;
    y[0] = yy;
    for(int i = 1;i<=n;i++){
      x[i] = sc.nextInt();
    }
    Arrays.sort(x);
    for(int i = 1;i<=m;i++){
      y[i] = sc.nextInt();
    }
    Arrays.sort(y);
    if(x[n]>=y[0]){
      System.out.println("War");
      return;
    }
    System.out.println("No War");
  }
}
