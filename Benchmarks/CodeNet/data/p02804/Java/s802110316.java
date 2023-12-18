import java.util.*;

public class Main{
  static long P = 1000000007;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    long[] nums = new long[N];
    for(int i = 0; i < N; i++){
      nums[i] = Long.parseLong(sc.next());
    }
    Arrays.sort(nums);
    
    long ans = 0;
    for(int i = 0; i <= N-K; i++){
      long min = nums[i];
      for(int j = i+K-1; j < N; j++){
        long max = nums[j];
        long fx = max-min;
        long C = calc(j-i-1, K-2);
        if(C != 0){
          fx *= C;
          fx %= P;
        }
        ans += fx;
        ans %= P;
      }
    }
    System.out.println(ans);
  }
  public static long calc(int A, int B){
    long C = 1;
    long D = 1;
    for(int i = 0; i < B; i++){
      C *= A-i;
      C %= P;
      D *= B-i;
      D %= P;
    }
    
    return C* inv(D, P-2) % P;
  }
  public static long inv(long E, long k){
    if(k == 0){
      return 1;
    }
    
    if(k%2 == 0){
      long l = inv(E, k/2);
      return l * l % P;
    }else{
      return E * inv(E, k-1) % P;
    }
  }
}