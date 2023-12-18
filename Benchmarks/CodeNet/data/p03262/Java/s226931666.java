import java.util.*;

class Main{
  public static int gcd(int m, int n) {
    int r;
    while (n > 0) {
        r = m % n;
        m = n;
        n = r;
    }
    return m;
}
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    n = n+1;
    int[] x = new int[n];
    for(int i = 0;i < n;i++){
      x[i] = scan.nextInt();
    }
    Arrays.sort(x);
    int m=0;
    for(int i = 0;i < n-1;i++){
      if(i == 0&&x.length >2){
        m = gcd(x[i+1]-x[i],x[i+2]-x[i+1]);
        continue;
      }else if(i == 0){
        m = x[i+1] - x[i];
      }
      m = gcd(m,x[i+1]-x[i]);
    }
    System.out.println(m);
  }
}
