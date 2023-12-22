
import java.util.Scanner;

class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    //反対の大きい数字を入れて初期化する
    //0を初期化したなら０が最小になるため、－の値を入れる必要がある
    //maxの場合上記の逆
    int min = 1000000;
    int max = -1000000;
    long  sum = 0L;

      for (int i=0; i<n; i++){
        int nn = sc.nextInt();
        min = Math.min(min,nn);
        max = Math.max(max,nn);
        sum += nn;
      }
      System.out.println(min + " " + max + " " + sum);
  }
}

