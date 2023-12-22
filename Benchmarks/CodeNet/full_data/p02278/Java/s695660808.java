import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  final int VMAX = 10000;

  public static void main(String[] args) {

    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int[] seq = new int[n];
      String[] line = br.readLine().split(" ");
      int min = VMAX;
      for (int i=0; i < n; i++) {
        seq[i] = Integer.parseInt(line[i]);
        if(seq[i] < min) min = seq[i];
      }
      System.out.println( minimumCostSort(seq,min) );
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private int minimumCostSort(int[] seq, int s) {
    int result=0;
    int n = seq.length;
    boolean[] v = new boolean[VMAX];
    int[] b = Arrays.copyOf(seq,n);
    int[] t = new int[VMAX+1];

    Arrays.sort(b);
    for(int i=0; i<n; i++)
      t[b[i]] = i;
    for(int i=0; i<n; i++) {
      if(v[i]) continue;

      int cur = i;
      int S   = 0;
      int m   = VMAX;
      int an  = 0;
      while(true) {
        v[cur] = true;
        an++;
        int iv = seq[cur];
        m = Math.min(m,iv);
        S += iv;
        cur = t[iv];

        if(v[cur]) break;
      }
      result += Math.min(S + (an-2) *m, m + S + (an+1) * s);
    }

    return result;
  }
}
