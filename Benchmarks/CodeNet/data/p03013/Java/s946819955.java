import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int mod = 1000000007;
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[m];
    int[] b = new int[m+1];
    int ba = 0;
    int bmax = 0;
    for (int i = 0;i < m;i++){
      a[i] = sc.nextInt();
      if (a[i] == ba){
        System.out.println(0);
        System.exit(0);;
      }
      b[i] = a[i] - ba-1;
      bmax = Math.max(bmax,b[i]);
      ba = a[i]+1;
    }
    sc.close();
    b[m] = n-ba;
    bmax = Math.max(bmax,b[m]);
    int[] f = new int[bmax+1];
    f[0] = 1;
    f[1] = 1;
    for (int i = 2; i < bmax+1;i++){
      f[i] = f[i-1] + f[i-2];
    }
    long ans = 1;
    for (int s:b){
      ans = ans*f[s]%mod;
      //System.out.println(ans);
    }
    System.out.println(ans%mod);
  }
}