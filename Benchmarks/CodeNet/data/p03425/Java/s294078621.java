import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      char[] ch = {'M','A','R','C','H'};
      long[] cnt = new long[5];
      String ln;
      for(int i=0; i<n; i++) {
        ln = in.readLine();
        char sf = ln.charAt(0);
        for (int j=0; j<ch.length; j++) {
          if(sf == ch[j]) {
            cnt[j]++;
            break;
          }
        }
      }

      long ans=0;
      for (int i=0; i<5; i++) {
        for (int j=i+1; j<5; j++) {
          for (int k=j+1; k<5; k++) {
            ans += cnt[i] * cnt[j] * cnt[k];
          }
        }
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}