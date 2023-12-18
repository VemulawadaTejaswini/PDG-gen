import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int M = Math.abs(N - K);
    if(N < K && N < M){
      System.out.println(N);
      return;
    }else if(N < K && M < N){
      System.out.println(M);
      return;
    }else if(M < Math.abs(M - K)){
      System.out.println(M);
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