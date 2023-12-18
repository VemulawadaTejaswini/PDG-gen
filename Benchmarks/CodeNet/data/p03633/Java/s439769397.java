import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long[] T = new long[N];
    long ans = 1;
    for (int i = 0; i< N; i++){
      T[i] = scanner.nextLong();
    }
    ans = getGCM(T[0], T[1]);
    for (int i = 1 ; i < N; i++){
      ans = getGCM(T[i], ans);

    }
    System.out.println(ans);
  }
  public static long getLCM(long a, long b){
    long lcm = a;
    while(b % a != 0){
      lcm = b % a;
      b = a;
      a = lcm;
    }
    return lcm;
  }
  public static long getGCM(long a, long b){
    return a * b / getLCM(a, b);
  }
}
