import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);

    int[] a = new int[n], b = new int[n];
    long[] c = new long[n];
    long ans = 0;

    for(int i = 0; i < n; i++){
      in = br.readLine().split(" ");
      a[i] = Integer.parseInt(in[0]);
      b[i] = Integer.parseInt(in[1]);
      c[i] = a[i] + b[i];
      ans -= b[i];
    }
    
    br.close();

    Arrays.sort(c);

    for(int i = 0; i < n; i += 2){
      ans += c[i];
    }

    System.out.println(ans);
  }
}