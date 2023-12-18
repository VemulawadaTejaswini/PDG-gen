import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long [] b = new long[241];
    long [] c = new long[241];

    for (int j=-120;j<121;j++){
      long gg = fast(j,5);
      b[j+120] = gg;
      c[j+120] = gg;
    }

    for(int i=240;i>=0;i--){
      for (int j = i-1; j>=0;j--){
        if (b[i] - c[j] == n){
          int a1 = i-120;
          int a2 = j-120;
          System.out.println(a1 + " " + a2);
          return;
        }
      }
    }

  }

  static long fast(int a, int b){
    long ans = 1;
    long base = a;
    while (b !=  0){
      if ((b & 1) == 1){
        ans *= base;
      }
      base = base*base;
      b >>= 1;
    }
    return ans;
  }
}
