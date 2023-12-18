import java.util.*;
public class Main {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      // 整数の入力
      int n = sc.nextInt();
    double sum = 0.0;
      for(int i = 0; i < n; i++){
        sum += 1 / sc.nextDouble();
      }
      System.out.println(1 / sum);
  }
  
}