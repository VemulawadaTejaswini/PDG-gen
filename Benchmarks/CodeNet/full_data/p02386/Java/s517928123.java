public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n = sc.nextInt();
    int[][] d = new int[n][6];
    int i, j;
    for(i = 0;i < n;i++)for(j = 0;j < 6;j++)d[i][j] = sc.nextInt();
    if(solve(d, n))out.println("Yes");
    else out.println("No");

    sc.close();
  }
  private static boolean solve(int[][] d, int n){
    int i, j;
    for(i = 0;i < n - 1;i++)for(j = i + 1;j < n;j++)
      if(isisom(d[i], d[j]))return false;
    return true;
  }
  private static boolean isisom(int[] d, int[] e){
    int i, j, k;
    for(i = 0;i < 6;i++){
      for(j = 0;j < 4;j++){
        for(k = 0;k < 6;k++)if(d[k] != e[k])break;
        if(k == 6)return true;
        rroll(d);
      }
      for(k = 0;k < 6;k++)if(d[k] != e[k])break;
      if(k == 6)return true;
      if(i % 2 == 0)nroll(d);
      else eroll(d);
    }
    return false;
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static void nroll(int[] dice){ //(1265)
    int tmp;
    tmp = dice[0]; dice[0] = dice[1]; dice[1] = dice[5];
    dice[5] = dice[4]; dice[4] = tmp;
    return;
  }
  private static void eroll(int[] dice){ //(1463)
    int tmp;
    tmp = dice[0]; dice[0] = dice[3]; dice[3] = dice[5];
    dice[5] = dice[2]; dice[2] = tmp;
    return;
  }
  private static void rroll(int[] dice){ //(2354)
    int tmp;
    tmp = dice[1]; dice[1] = dice[2]; dice[2] = dice[4];
    dice[4] = dice[3]; dice[3] = tmp;
    return;
  }
}