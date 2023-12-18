import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] bar = new long[N];
    long sum = 0;
    for(int i=0; i<N; i++){
      bar[i] = sc.nextLong();
      sum += bar[i];
    }
    long ans = sum;
    long temp = 0;
    for(int i=0; i<N-1; i++){
      temp += bar[i];
      ans = Math.min(ans, Math.abs(sum - temp - temp));
    }
    System.out.print(ans);
  }
}
