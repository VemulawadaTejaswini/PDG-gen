public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    String str;
    int i, res;
    int[] dice;

    dice = new int[6];

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      res = 1;
      for(i = 0;i < 6;i++){
        dice[i] = i + 1;
      }

      for(i = 0;i < n;i++){
        str = sc.next();
        if("North".equals(str)){
          nroll(dice);
        }else if("East".equals(str)){
          eroll(dice);
        }else if("West".equals(str)){
          eroll(dice);
          eroll(dice);
          eroll(dice);
        }else if("South".equals(str)){
          nroll(dice);
          nroll(dice);
          nroll(dice);
        }else if("Right".equals(str)){
          rroll(dice);
        }else{
          rroll(dice);
          rroll(dice);
          rroll(dice);
        }
        res += dice[0];
      }
      System.out.println(res);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static void nroll(int[] dice){ //(1265)
    int tmp;
    tmp = dice[0];
    dice[0] = dice[1];
    dice[1] = dice[5];
    dice[5] = dice[4];
    dice[4] = tmp;
    return;
  }

  private static void eroll(int[] dice){ //(1463)
    int tmp;
    tmp = dice[0];
    dice[0] = dice[3];
    dice[3] = dice[5];
    dice[5] = dice[2];
    dice[2] = tmp;
    return;
  }

  private static void rroll(int[] dice){ //(2354)
    int tmp;
    tmp = dice[1];
    dice[1] = dice[2];
    dice[2] = dice[4];
    dice[4] = dice[3];
    dice[3] = tmp;
    return;
  }

}