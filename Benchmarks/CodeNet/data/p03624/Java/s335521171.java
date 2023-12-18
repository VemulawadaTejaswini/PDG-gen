import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    String[] s = str.split("");
    Set<String> hs = new HashSet<>();
    for(int i=0; i<str.length(); i++) {
      hs.add(s[i]);
    }
        
    int ans_num = 0;
    for(int i=97; i<=122; i++) {
      if(hs.contains(String.valueOf((char)i))==false) {
        ans_num = i;
        break;
      }
    }
    
    System.out.println(ans_num==0?"None":(char)ans_num);
  }
}