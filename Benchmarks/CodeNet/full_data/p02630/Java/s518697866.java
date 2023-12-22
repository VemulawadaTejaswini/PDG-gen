import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      Map<Integer, Integer> map = new HashMap<>();
      long total = 0;
      for(int i = 0; i < N; i++){
        int A = sc.nextInt();
        if(map.containsKey(A)){
          int count = map.get(A);
          map.put(A,count+1);
        }else{
          map.put(A,1);
        }
        total += A;
      }
      int Q = sc.nextInt();
      
      // 操作
      for(int i = 0; i < Q; i++){
        int B = sc.nextInt();
        int C = sc.nextInt();
        total = operation(map, B, C, total);
        System.out.println(total);
      }
      
      
      // 出力
      //System.out.println(result);
    }
    
    // 【操作】マップを更新し総和を求める関数
    public static long operation(Map<Integer, Integer> map, int B, int C, long total){
      long newTotal = total;
      if(map.containsKey(B)){
        int bCount = map.get(B);
        int cCount = 0;
        if(map.containsKey(C)){
          cCount = map.get(C);
        }
        long dif = (long)(C - B) * bCount;
        newTotal = total + dif;
        map.put(C, bCount + cCount);
        map.remove(B);
      }
      
      return newTotal;
    }
    

}