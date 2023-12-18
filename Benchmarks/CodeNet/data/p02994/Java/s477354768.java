import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    // 入力値の読み込み
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    int[] Ls = new int[N];
    int min = 100; // Lの最大値
    int sum = 0;
    // 絶対値最小を検出
    for(int i=0; i<Ls.length; i++){
      Ls[i] = L + i;
      if(Math.abs(Ls[i]) < Math.abs(min)){
        min = Ls[i];
      }
      sum += Ls[i];
    }
    sum -= min;
    System.out.println(sum);
  }
}