import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();
    long[] a = new long[n];
    long[] b = new long[m];
    a[0] = sc.nextLong();//a ha ruisekiwa
    for(int i = 1;i<n;i++){
      a[i] = sc.nextLong() + a[i-1];
    }
    for(int i = 0;i<m;i++){//b ha hutuu
      b[i] = sc.nextLong();
    }
    //kokokara sagasite ikuyo!
    int asatu = 0;
    long total = 0;
    for(int i = n -1;i>-1;i--){
      if(a[i] <= k){
        asatu = i+1;
        total = a[i];
        break;
      }
    }
    int bsatu = 0;
    for(int i = 0;i<m;i++){
      bsatu++;
      total = total + b[i];
      if(total> k){
        asatu--;
        if(asatu < 1)break;
        total = total -a[asatu]+a[asatu-1];
      }
    }
    System.out.println(asatu+bsatu);
  }
}
