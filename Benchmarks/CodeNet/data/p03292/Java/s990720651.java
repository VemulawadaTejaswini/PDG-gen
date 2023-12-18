import java.util.Arrays;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    //変数群の宣言
    String s = "";
    String[] str = null;
    int[] input = null;
    boolean success = true;
    int output = 0;
    
    //入力
    Scanner scanner = new Scanner(System.in);
    System.out.println("コストを入力して下さい。");
    s = scanner.nextLine();
    scanner.close();
    
    //String配列化
    str = s.split(" ",0);
    
    //int配列化
    input = new int[str.length];
    try {
      for(int i=0; i<str.length; i++) {
        input[i]=Integer.parseInt(str[i]);
      }
    }catch(Exception e) {
      System.out.println("正しいフォーマットで入力して下さい");
      success = false;
    }
    
    //並べ替え
    Arrays.sort(input);
    
    //出力データ作成
    for(int i=0; i<input.length-1; i++) {
      output += (input[i+1]-input[i]);
    }
    
    //出力
    if(success){
      System.out.println("実行コストの最小値は "+output+" です。");
    }
    
  }
  
}