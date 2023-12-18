import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    StringBuilder result = new StringBuilder();
    for (String s : process(n)){
      result.append(s).append("\n");
    }
    System.out.println(result);
  }
  
  public static List<String> process(int length){
    if (length == 1){
      List<String> result = new ArrayList<>();
      result.add("a");
      return  result;
    } else {
      List<String> result = new ArrayList<>();
      for (String s : process(length - 1)) {
        char c = 'a';
        while (Character.codePointAt(s, s.length() - 1)+1 >= c) {
          result.add(s + c);
          c++;
        }
      }
      return result;
    }
  }
}
