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
    b[0] = sc.nextLong();//b mo ruisekiwa
    for(int i = 1;i<m;i++){
      b[i] = sc.nextLong() + b[i-1];
    }
    //kokokara sagasite ikuyo!
    int satu = 0;
    for(int i = 0;i<n;i++){
      for(int j = 0;j<m;j++){
        if(a[i]+b[j]<=k){
          satu = Math.max(satu,i+j+2);
        }
      }
    }
    System.out.println(satu);

  }
}
