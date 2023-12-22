import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] p = new int[N];
      for(int i = 0; i < N; i++){
        p[i] = sc.nextInt();
      }
      Arrays.sort(p);
      
      // 算出
      int price = 0;
      for(int i = 0; i < K; i++){
        price += p[i];
      }
      
      // 出力
      System.out.println(price);
    }

}