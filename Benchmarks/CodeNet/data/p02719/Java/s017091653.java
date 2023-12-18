import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    long M = Math.abs(N - K);
    if(N < K && N < M){
      System.out.println(N);
      return;
    }else if(N < K && M < N){
      System.out.println(M);
      return;
    }else if(M < Math.abs(M - K)){
      System.out.println(M);
      return;
    }else if(N % K == 0){
      System.out.println(0);
      return;
    }
    while(true){
      if(M < K){
        System.out.println(Math.abs(M - K));
        break;
      }
      M = Math.abs(M- K);
    }
  }
}