import java.io.*;

public class Main {
  public static void main(String... args) {
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));

    try {
      char[] s = br.readLine().toCharArray();
      for(int i = 0; i < s.length; i++) {
        if(s[i] != 'U' && s[i] != 'D') {
          if((i % 2 == 0 && s[i] == 'L')
          || (i % 2 != 0 && s[i] == 'R')) {
            System.out.println("No");
            return;
          }
        }
      }
      System.out.println("Yes");
      br.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}