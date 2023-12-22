import java.util.*;

public class Main{
    public static void main(String[] args) {
      // 標準入力からデータを読み込む準備
      try (Scanner sc = new Scanner(System.in)) { String line = sc.nextLine();
      String answer = "";
      String tmp;
      int length = line.length();
      for (int i = 0; i < length; i++) {
      char ch = line.charAt(i);
      if(Character.isLowerCase(ch) == true){
        
        ch = Character.toUpperCase(ch);
        tmp = String.valueOf(ch);
        answer = answer + tmp;
      }else{
        ch = Character.toLowerCase(ch);
          tmp = String.valueOf(ch);
        answer = answer + tmp;
      }
    }
    System.out.println(answer);
  }
}
}

