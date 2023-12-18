import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int[] p = new int[m];
    String[] s = new String[m];
    int numAc = 0;
    int numWaCorrecting = 0;
    boolean[] acCorrecttingFlg = new boolean[n];
    boolean[] waCorrecttingFlg = new boolean[n];
    
    for(int i=0; i<m; i++) {
      str = in.readLine().split(" ");
      p[i] = Integer.parseInt(str[0]);
      s[i] = str[1];
      if(s[i].equals("AC") && acCorrecttingFlg[p[i]-1]==false) {
        acCorrecttingFlg[p[i]-1]=true;
        numAc++;
      } else if(s[i].equals("WA") && waCorrecttingFlg[p[i]-1]==false) {
        waCorrecttingFlg[p[i]-1]=true;
        numWaCorrecting++;
      }
    }

    System.out.println(numAc + " " + numWaCorrecting);
  }
}