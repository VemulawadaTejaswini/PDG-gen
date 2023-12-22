public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int[] d, e;
    int i;
    d = new int[6]; e = new int[6];
    for(i = 0;i < 6;i++)d[i] = sc.nextInt();
    for(i = 0;i < 6;i++)e[i] = sc.nextInt();
    if(solve(d, e))out.println("Yes");
    else out.println("No");

    sc.close();
  }
  private static boolean solve(int[] d, int[] e){
    int i, j, k;
    for(i = 0;i < 4;i++){
      for(j = 0;j < 3;j++){
        for(k = 0;k < 6;k++)if(d[k] != e[k])break;
        if(k == 6)return true;
        nroll(d);
        for(k = 0;k < 6;k++)if(d[k] != e[k])break;
        if(k == 6)return true;
        eroll(d);
      }
      for(k = 0;k < 6;k++)if(d[k] != e[k])break;
      if(k == 6)return true;
      rroll(d);
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