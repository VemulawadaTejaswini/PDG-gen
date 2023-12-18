import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      ArrayList<Integer> hateNums = new ArrayList<>();
      for(int i = 0; i < K; i++){
        int D = sc.nextInt();
        hateNums.add(D);
      }
      
      // 条件値算出
      int result = 0;
      for(int i = N; i < 100000; i++){
        if(!containHateNum(i, hateNums)){
          result = i;
          break;
        }
      }
      
      // 出力
      System.out.println(result);
    }
    
    // 引数の値に嫌いな数字が含まれているか判定する関数
    public static boolean containHateNum(int target, ArrayList<Integer> hateNums){
      int workNum = target;
      
      while(workNum > 0){
        int digit = workNum % 10;
        if(hateNums.contains(digit)){
          return true;
        }
        
        workNum = workNum / 10;
      }
      
      return false;
    }
    
}