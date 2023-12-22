import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //参考書の種類
        int M = sc.nextInt(); //アルゴリズムの種類
        int X = sc.nextInt(); //理解度の目標数値
        int[][] figure = new int[N][M+1]; //0: 購入価格, 1~: アルゴリズむの理解度
        for(int i = 0; i < N; i++){
          figure[i][0] = Integer.parseInt(sc.next());
          for(int j = 1; j <= M; j++){
            figure[i][j] = Integer.parseInt(sc.next());
          }
        }

        int min = Integer.MAX_VALUE;
        boolean judge = true;
        IntBinaryOperator smallNumber =
          (num1, num2) -> num1 <= num2 ? num1 : num2;
        for(int i = 0; i < Math.pow(2, N); i++){
          int[] rikaido = new int[M];
          int total = 0;
          Arrays.fill(rikaido, 0);
          for(int j = 0; j < N; j++){
            if((1&i>>j) == 1){
              total += figure[j][0];
              for(int k = 0; k < M; k++){
                rikaido[k] += figure[j][k+1];
              }
            }
          }
          OptionalInt o = Arrays.stream(rikaido).reduce(smallNumber);
          if(X <= o.getAsInt()){
            min = smallNumber.applyAsInt(min, total);
          }
        }

        if(min == Integer.MAX_VALUE)
          System.out.println(-1);
        else
          System.out.println(min);
    }
}
