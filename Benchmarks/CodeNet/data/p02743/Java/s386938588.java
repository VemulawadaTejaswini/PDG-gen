import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      double a = (double)sc.nextInt();
      double b = (double)sc.nextInt();
      double c = (double)sc.nextInt();
      
      // 大小判定
      double left,right;
      if(a > b){
        left = a - b;
        right = Math.sqrt(c) * (Math.sqrt(a) - Math.sqrt(b));
      }else{
        left = b - a;
        right = Math.sqrt(c) * (Math.sqrt(b) - Math.sqrt(a));
      }
      String result = "";
      if(left < right){
        result = "Yes";
      }else{
        result = "No";
      }
      
      // 出力
      System.out.println(result);
    }
    
    // 平方根の計算を行う関数
    public static void name(){
    }
    
    // 文字列のx文字目を取得する関数
    public static String strAt(String str, int x){
      return String.valueOf(str.charAt(x));
    }
    
    // クラス開始ロガー関数
    // String className : クラス名
    public static void loggerStart(String className){
      System.out.println("Start " + className);
    }
    
    // クラス終了ロガー関数
    // String className : クラス名
    public static void loggerEnd(String className){
      System.out.println("End " + className);
    }
    
    // Int型変数ロガー関数
    // String name : 変数名
    // int val : 値
    public static void loggerInt(String name, int val){
      System.out.println(name + " = " + val);
    }
    
    // double型変数ロガー関数
    // String name : 変数名
    // double val : 値
    public static void loggerDbl(String name, double val){
      System.out.println(name + " = " + val);
    }
    
    // String型変数ロガー関数
    // String name : 変数名
    // String val : 値
    public static void loggerStr(String name, String val){
      System.out.println(name + " = " + val);
    }
    
    // Int型配列変数ロガー関数
    // String name : 変数名
    // int val : 値
    public static void loggerArrayInt(String name, int[] val){
      for(int i = 0; i < val.length; i++){
          System.out.println(name + "[" + i + "] = " + val[i]);
      }
    }
    
    // Double型配列変数ロガー関数
    // String name : 変数名
    // double val : 値
    public static void loggerArrayDbl(String name, double[] val){
      for(int i = 0; i < val.length; i++){
          System.out.println(name + "[" + i + "] = " + val[i]);
      }
    }
    
    // String型配列変数ロガー関数
    // String name : 変数名
    // String val : 値
    public static void loggerArrayStr(String name, String[] val){
      for(int i = 0; i < val.length; i++){
          System.out.println(name + "[" + i + "] = " + val[i]);
      }
    }
    


}