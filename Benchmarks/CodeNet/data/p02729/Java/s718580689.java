import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] n = new int[N];
        for(int i=0; i<N; i++) {
          n[i] = sc.nextInt();
        }
    int M = sc.nextInt();
    int[] m = new int[N];
        for(int i=0; i<N; i++) {
          m[i] = sc.nextInt();
        }
    int cnt = 0;
    for(int i=0; i<=N; i++){
        if((m[i]+n[i])%2 == 0) {
            cnt++;
        } else {
          continue;
        }
      }
    }
    System.out.println(cnt);
  }
}