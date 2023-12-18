import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      //String[] S = new String[N];
      List<String> list = new ArrayList<>();
      int kind = 0;

      // ガチャ
      for(int i = 0; i < N; i++){
        String prise = sc.next();
        if(!list.stream().anyMatch(s -> s.equals(prise))){
          list.add(prise);
          kind++;
        }
      }

      // 出力
      System.out.println(kind);
    }
    
}