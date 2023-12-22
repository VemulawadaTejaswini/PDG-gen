import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int kind = 0;
      Map<String, Integer> priseMap = new HashMap<>();

      // ガチャ
      for(int i = 0; i < N; i++){
        String prise = sc.next();
        if(!priseMap.containsKey(prise)){
          priseMap.put(prise, 0);
          kind++;
        }
      }

      // 出力
      System.out.println(kind);
    }
    
}