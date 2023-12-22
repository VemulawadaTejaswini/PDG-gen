import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
      // カウント
      int count = 0;
      for(long A = 1L; A < N; A++){
        for(long B = 1L; B <= A; B++){
          if(A*B < N){
            if(A != B){
              count += 2;
            }else{
              count++;
            }
          }else{
            break;
          }
        }
      }
      
      // 出力
      System.out.println(count);
    }
    
}