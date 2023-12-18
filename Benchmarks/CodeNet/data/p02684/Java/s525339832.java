import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    long K = in.nextLong();

    int[] path = new int[N];
    for (int i = 0; i < N; i++) {
      path[i] = in.nextInt() - 1;
    }

    int[] visited = new int[N];
    Arrays.fill(visited, -1);
    
    int count = 0;
    int index = 0;
    
    while (visited[index] == -1) {
      visited[index] = count;
      index = path[index];
      count++;
    }

    int stepToLoop = visited[index];
    int stepInLoop = count - visited[index];

    int k;
    if (K < stepToLoop) {
      k = (int) K;
    } else {
      k = stepToLoop + (int) ((K - ((long) stepToLoop)) % stepInLoop);
    }

    int ans = 0;
    for (int i = 0; i < k; i++) {
      ans = path[ans];
    }

    System.out.println(ans + 1);

  }
}
