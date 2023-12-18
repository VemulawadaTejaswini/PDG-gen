import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long[] beauty = new long[N];
    long[] lusciousness = new long[N];
    long[] popularity = new long[N];

    for(int i = 0; i<N; i++){
      beauty[i] = sc.nextLong();
      lusciousness[i] = sc.nextLong();
      popularity[i] = sc.nextLong();
    }

    long[][] value = new long[8][N];
    long score = 0;

    for(int i = 0; i<8; i++){

      for(int j = 0; j<N; j++){
        value[i][j] += (i&4) == 0?beauty[j]:-beauty[j];
        value[i][j] += (i&2) == 0?lusciousness[j]:-lusciousness[j];
        value[i][j] += (i&1) == 0?popularity[j]:-popularity[j];
      }

      Arrays.sort(value[i]);
      //配列の昇順ソート
      long sum = 0;
      for(int j = 0; j<M; j++){
        sum += value[i][N-1-j];
      }
      score = Math.max(score, sum);
    }

    System.out.println(score);
  }
}
