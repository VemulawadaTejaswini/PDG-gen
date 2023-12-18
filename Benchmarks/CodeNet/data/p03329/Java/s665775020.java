import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        solve(N);
      }
     
      static void solve(int N) {
        long ans = Long.MAX_VALUE;
        for (int i=0; i<=N; i++) {
          int tmpI = i;
          int tmpJ = N-i;
          int tmpAns = 0;
          while (tmpI > 0) {
            tmpAns += tmpI % 9;
            tmpI /= 9;
          }
          while (tmpJ > 0) {
            tmpAns += tmpJ % 6;
            tmpJ /= 6;
          }
          ans = Math.min(tmpAns, ans);
        }
        System.out.println(ans);
    }
}