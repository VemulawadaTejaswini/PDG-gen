import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
  
  static int x, y, a, b, c;
  static long ans = 0L;
  static long[] p, q, r;

  static long max(long a, long b, long c){
    return Math.max(Math.max(a, b), c);
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in;
    in = br.readLine().split(" ");
    x = Integer.parseInt(in[0]);
    y = Integer.parseInt(in[1]);
    a = Integer.parseInt(in[2]);
    b = Integer.parseInt(in[3]);
    c = Integer.parseInt(in[4]);

    in = br.readLine().split(" ");
    p = Stream.of(in).mapToLong(Long::parseLong).toArray();
    in = br.readLine().split(" ");
    q = Stream.of(in).mapToLong(Long::parseLong).toArray();
    in = br.readLine().split(" ");
    r = Stream.of(in).mapToLong(Long::parseLong).toArray();

    br.close();

    Arrays.sort(p);
    Arrays.sort(q);
    Arrays.sort(r);
    long[] all = new long[x + y + c];
    
    for(int i = 0; i < x; i++){
      all[i] = p[a - i - 1];
    }
    for(int i = 0; i < y; i++){
      all[x + i] = q[b - i - 1];
    }
    for(int i = 0; i < c; i++){
      all[x + y + i] = r[c - i - 1];
    }

    Arrays.sort(all);

    for(int i = 0; i < x + y; i++){
      ans += all[x + y + c - i - 1];
    }

    System.out.println(ans);
  }
}