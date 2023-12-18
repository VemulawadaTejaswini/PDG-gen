import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];
    boolean[][] adj = new boolean[N + 10][N + 10];
    boolean flag = false;
    for (int i = 0; i < M; i++){
      a[i] = scanner.nextInt();
      b[i] = scanner.nextInt();
      adj[a[i]][b[i]] = adj[b[i]][a[i]] = true;
    }
    for (int k = 1; k <= N; k++){
      if (adj[1][k] == true & adj[k][N] == true){
        flag = true;
        if (flag = true){
          System.out.println("POSSIBLE");
          break;
        }
      } else if (k == N & flag == false){
        System.out.println("IMPOSSIBLE");
      }
    }
  }
}
