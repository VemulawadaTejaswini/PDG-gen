import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long[] x = new long[m];
    for(int i = 0;i<m;i++){
      x[i] = sc.nextLong();
    }
    if(n>=m){
      System.out.println(0);
      return;
    }
    Arrays.sort(x);
    long[] dis = new long[m-1];
    long total = 0l;
    for(int i = 0;i<m-1;i++){
      dis[i] = x[i+1] - x[i];
      total += dis[i];
    }
    Arrays.sort(dis);
    for(int i = 0;i<n-1;i++){
      total -= dis[m-2-i];
    }
    System.out.println(total);

  }
}
