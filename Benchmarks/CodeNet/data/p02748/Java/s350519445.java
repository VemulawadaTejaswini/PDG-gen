import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int M = sc.nextInt();
      
      int arrayA[] = new int[A];
      for(int i = 0; i < A; i++){
        arrayA[i] = sc.nextInt();
      }
      
      int arrayB[] = new int[B];
      for(int i = 0; i < B; i++){
        arrayB[i] = sc.nextInt();
      }
      
      int arrayX[] = new int[M];
      int arrayY[] = new int[M];
      int arrayC[] = new int[M];
      for(int i = 0; i < M; i++){
        arrayX[i] = sc.nextInt();
        arrayY[i] = sc.nextInt();
        arrayC[i] = sc.nextInt();
      }
      
      // 割引券未使用時の最小金額
      int min = Integer.MAX_VALUE;
      for(int i = 0; i < A; i++){
        for(int j = 0; j < B; j++){
          int price = arrayA[i] + arrayB[j];
          if(price < min){
            min = price;
          }
        }
      }
      
      // 割引券使用時の最小金額
      for(int i = 0; i < M; i++){
        int price = arrayA[arrayX[i]-1] + arrayB[arrayY[i]-1] - arrayC[i];
        if(price < min){
          min = price;
        }
      }
      
      // 出力
      System.out.println(min);
    }

}