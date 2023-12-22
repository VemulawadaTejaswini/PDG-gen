import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 入力値を取得する
    String input = sc.nextLine();
    String result = "0";

    int result1 = input.indexOf("RRR");
    if (result1 > -1) {
      result = "3";
    } else {
	    int result2 = input.indexOf("RR");
        if (result2 > -1) {
          result = "2";
        } else {
          int result3 = input.indexOf("R");
          if (result3 > -1) {
            result = "1";
          }
        }
    }
    System.out.println(result);
  }
}
