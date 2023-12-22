import java.util.*;

class Main{
  private static int[] vs;
  private static int[] ws;

  private static Cheet[][] memo;

  private static int N;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    for(int num = 1;; num++) {
      int W = sc.nextInt();
      if (W == 0) {
        break;
      }
      N = sc.nextInt();
      vs = new int[N];
      ws = new int[N];  

      memo = new Cheet[W+1][N+1];
      for (int i = 0; i < N; i++) {
        String[] s = sc.next().split(",");
        vs[i] = Integer.parseInt(s[0]); //value
        ws[i] = Integer.parseInt(s[1]); //weight
      }

      System.out.println("Case " + num + ":");
      int[] result = new int[2];
      dp(0, W, result);
      System.out.println(result[0]);
      System.out.println(result[1]);
    }
    sc.close();
  }

  public static void dp(int index, int weight, int[] out)
  {
    if (memo[weight][index] != null) {
      out[0] = memo[weight][index].value;
      out[1] = memo[weight][index].weight;
      return;
    }

    int[] res = new int[2];
    int[] res2 = new int[2];
    if (index == N) {
      res[0] = 0;
      res[1] = 0;
    }
    else if (ws[index] > weight) {
      dp(index + 1, weight, res);
    }
    else {
      dp(index + 1, weight, res);
      dp(index + 1, weight - ws[index], res2);
      res2[0] += vs[index];
      res2[1] += ws[index];
      if (res[0] < res2[0]) {
        res = res2;
      }
      else if (res[0] == res2[0]) {
        res[1] = Math.min(res[1], res2[1]);
      }
    }

    out[0] = res[0];
    out[1] = res[1];

    Cheet cheet = new Cheet();
    cheet.value = out[0];
    cheet.weight = out[1];
    memo[weight][index] = cheet;
    return;
  }

  private static class Cheet {
    public int value;
    public int weight;
  }
}
