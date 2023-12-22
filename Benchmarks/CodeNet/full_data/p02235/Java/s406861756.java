import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int q = Integer.parseInt(br.readLine());
      StringBuilder buf  = new StringBuilder();

      for(int i=0; i<q; i++) {
        buf.append( deriveLcs(br.readLine(), br.readLine()) )
           .append("\n");
      }

      System.out.print(buf);
    }
    catch (IOException e) {
      System.out.println("IOException!");
    }
  }

  private int deriveLcs(String seqX, String seqY) {
    int m = seqX.length();
    int n = seqY.length();
    int size = m > n ? m+1 : n+1;
    int[][] subSeq = new int[size][size];
    int maxSubSeq = 0;

    for(int i=1; i<=m; i++) subSeq[i][0] = 0;
    for(int j=1; j<=n; j++) subSeq[0][j] = 0;

    for(int i=1; i<=m; i++) {
      for(int j=1; j<=n; j++) {
        if(seqX.charAt(i-1) == seqY.charAt(j-1))
          subSeq[i][j] = subSeq[i-1][j-1] + 1;
        else
          subSeq[i][j] = Math.max(subSeq[i-1][j], subSeq[i][j-1]);

        maxSubSeq = Math.max(maxSubSeq, subSeq[i][j]);
      }
    }

    return maxSubSeq;
  }
}
