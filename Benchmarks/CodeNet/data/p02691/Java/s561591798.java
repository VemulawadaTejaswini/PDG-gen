import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] A = new int[N];
      int count = 0;
      for(int i = 0; i < N; i++){
        A[i] = sc.nextInt();
      }
      
      for(int i = 0; i < N; i++){
        for(int j = i+1; j < N; j++){
          int absNum = Math.abs(i - j);
          if(A[i] + A[j] == absNum){
            count++;
          }
        }
      }
      
      // 出力
      System.out.println(count);
    }

}