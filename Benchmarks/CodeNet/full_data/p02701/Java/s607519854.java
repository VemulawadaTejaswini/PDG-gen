import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String[] S = new String[N];
      for(int i = 0; i < N; i++){
        S[i] = sc.next();
      }
      List<String> prise = new ArrayList<>();
      int kind = 0;
      
      // ガチャ
      for(int i = 0; i < N; i++){
        if(!prise.contains(S[i])){
          prise.add(S[i]);
          kind++;
        }
      }
      
      // 出力
      System.out.println(kind);
    }
    
}