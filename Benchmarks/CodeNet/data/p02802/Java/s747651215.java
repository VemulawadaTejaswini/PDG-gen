import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    if(m==0) {
      System.out.println("0 0");
      return;
    }
    
    int[] p = new int[m];
    String[] s = new String[m];
    int numCorrectingAc = 0;
    int numWa = 0;
    boolean[] acCorrecttingFlg = new boolean[n+1];
    
    for(int i=0; i<m; i++) {
      str = in.readLine().split(" ");
      p[i] = Integer.parseInt(str[0]);
      s[i] = str[1];
      if(acCorrecttingFlg[p[i]-1]) continue;
      if(s[i].equals("WA")) {
        numWa++;
      } else {
        acCorrecttingFlg[p[i]-1]=true;
        numCorrectingAc++;

      }
    }

    System.out.println(numCorrectingAc + " " + numWa);
  }
}