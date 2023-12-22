import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int[][] graph = new int[n][n];
      String[] vInfo;
      int degree;

      for(int i=0; i<n; i++) {
        vInfo = br.readLine().split(" ");
        degree = Integer.parseInt(vInfo[1]);
        for(int j=0,k=2,v=0; j<degree; j++) {
          v = Integer.parseInt(vInfo[k++]);
          graph[i][v-1] = 1;
        }
      }

      StringBuilder buf = new StringBuilder();
      for (int[] i : graph) {
        for (int v : i) {
          buf.append(v).append(" ");
        }
        buf.setLength(buf.length()-1);
        buf.append("\n");
      }

      System.out.print(buf);
    }
    catch (IOException e) {
      System.out.println("IOException!");
    }
  }
}
