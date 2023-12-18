import java.util.Scanner;

public class Main{
  static Long T[];
  static Long A[];
  static Long TA[];
  static Long TT[];
  static int  N;
  static Long ans=0;

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    T = new Long[N];
    TT = new Long[N];
    TA = new Long[N];
    A = new Long[N];
    for(int i=0;i<N;i++){
      T[i] = sc.nextLong();
      A[i] = sc.nextLong();
    }
    TT[0] = T[0];
    TA[0] = A[0];
    ans += T[0]+A[0];
    for(int i=0;i<N-1;i++){
      update(i);
    }
    System.out.println(ans);
  }


  static void update(int m){
    Long k = Math.max((TT[m] + T[m+1] - 1) / T[m+1], (TA[m] + A[m+1] - 1) / A[m+1]);
    ans += T[m+1]*k-TT[m]-TA[m]+A[m+1]*k;
    TT[m+1] = T[m+1]*k;
    TA[m+1] = A[m+1]*k;
  }
}
