import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
	  String str = scan.next();
      
      // 変数strの長さ分回す
      for (int i = 0; i < str.length(); i++) {
          // 配列に順番に格納する
          strArray[i] = "x";
      }
      
      StringBuilder sb = new StringBuilder();
      for(int i =0; i < strArray.length(); i++){
		sb.append(i); 
      }
		
	  System.out.println(sb.toString());// あいうえお
      
    }
}