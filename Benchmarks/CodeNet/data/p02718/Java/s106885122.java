import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  static int n, m;
  static int[] a;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);

    in = br.readLine().split(" ");
    a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    br.close();

    Arrays.sort(a);

    int sum = 0;
    for(int i = 0; i < n; i++){
      sum += a[i];
    }

    int lim = (sum-1) / (4 * m) + 1;

    boolean ok = true;
    for(int i = n - 1; i >= n - m; i--){
      if(a[i] < lim) ok = false;
    }

    System.out.println(ok ? "Yes" : "No");
  }
}