import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String input = bf.readLine();
    System.out.println(check(input));
    bf.close();
  }
  static String check(String s){
    //文字列sの最初の文字について、偶数個あったら、trueを返す。
    if (s.length() == 0) {
      return "Yes";
    }
    char[] cList = s.toCharArray();
    char checkChar = cList[0];
    int count = 0;
    StringBuilder sb = new StringBuilder();
    for (char c : cList) {
      if (c == checkChar) {
        count++;
      } else {
        sb.append(c);
      }
    }
    if (count % 2 == 0) {
      return check(sb.toString());
    } else {
      return "No";
    }
  }
}