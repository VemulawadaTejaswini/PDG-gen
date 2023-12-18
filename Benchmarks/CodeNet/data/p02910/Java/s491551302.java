import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int s_len = s.length();
    boolean flag_odd = true;
    boolean flag_even = true;
    
    for(int i = 0; i <= s_len-1; i+=2) {
      if(s.charAt(i)=='R' || s.charAt(i)=='U' || s.charAt(i)=='D') {
      } else {
        System.out.println(i);
      flag_odd = false;
      }
    }
    
    for(int i = 1; i <= s_len-1; i+=2) {
      if(s.charAt(i)=='L' || s.charAt(i)=='U' || s.charAt(i)=='D') {
      } else {
      flag_even = false;
      }
    }
    
    System.out.println((flag_odd==true) && (flag_even==true)?"Yes":"No");
  }
}