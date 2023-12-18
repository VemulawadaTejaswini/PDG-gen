import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      
      // RGBリストを作成
      List<Integer> listR = new ArrayList<Integer>();
      List<Integer> listG = new ArrayList<Integer>();
      List<Integer> listB = new ArrayList<Integer>();
      for(int i = 0; i < N; i++){
        String color = strAt(S, i);
        if(color.equals("R")){
          listR.add(i);
        }else if(color.equals("G")){
          listG.add(i);
        }else{
          listB.add(i);
        }
      }
      
      // 条件1を満たす組の個数を求める
      int count1 = listR.size() * listG.size() * listB.size();
      
      // 条件2を満たさない組の個数を求める
      int count2 = 0;
      for(int i = 0; i < N; i++){
        int maxInterbal = (N - 1 - i) / 2;
        for(int j = 1; j <= maxInterbal; j++){
          String s1 = strAt(S,i);
          String s2 = strAt(S,i+j);
          String s3 = strAt(S,i+j*2);
          if(isDifferent(s1,s2,s3)){
            count2++;
          }
        }
      }
      
      // 出力
      System.out.println(count1 - count2);
    }
    
    // 3文字が異なるか判定する関数
    public static boolean isDifferent(String s1, String s2, String s3){
      if(s1.equals(s2) || s1.equals(s3) || s2.equals(s3)){
        return false;
      }else{
        return true;
      }
    }
    
    // 文字列のx文字目を取得する関数
    public static String strAt(String str, int x){
      return String.valueOf(str.charAt(x));
    }
    

}