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
      int[] seq = new int[n];
      int i=0;
      for (String var : br.readLine().split(" "))
        seq[i++] = Integer.parseInt(var);

      int q = partition(seq, 0, n-1);
      dispIntArrayPartition(seq, q);
    }
    catch(IOException e) {
      System.out.println("IOException!");
    }
  }

  public int partition(int[] seq, int p, int r) {

    int x = seq[r];
    int i = p-1;
    int t;

    for(int j=p; j<r; j++) {
      if(seq[j] <= x) {
        t = seq[++i]; seq[i] = seq[j]; seq[j] = t;
      }
    }
    t = seq[i+1]; seq[i+1] = seq[r]; seq[r] = t;

    return i+1;
  }

public void dispIntArrayPartition(int[] target, int q) {
  StringBuilder s = new StringBuilder();
  int l=target.length-1;

  for (int i=0; i<q; i++) { s.append(target[i]).append(" "); }
  s.append("[").append(target[q]).append("] ");
  for (int i=q+1; i<l; i++) { s.append(target[i]).append(" "); }
  s.append(target[l]);

  System.out.println(s);
  }
}
