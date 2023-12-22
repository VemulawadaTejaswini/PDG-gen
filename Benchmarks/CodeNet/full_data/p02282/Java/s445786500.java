import java.util.stream.*;
import java.io.*;

public class Main {

  static int n, pos, ansInp;
  static int[] pre, inp, post;

  static void reconstruction(int l, int r){
    if(l >= r) return;

    int c = pre[pos++], m = 0;
    for(; m < n; m++){
      if(inp[m] == c) break;
    }

    reconstruction(l, m);
    reconstruction(m+1, r);

    post[ansInp++] = c;
    return;
  }
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    in = br.readLine().split(" ");
    pre = Stream.of(in).mapToInt(Integer::parseInt).toArray();
    in = br.readLine().split(" ");
    inp = Stream.of(in).mapToInt(Integer::parseInt).toArray();
    post = new int[n];

    br.close();

    pos = 0;
    ansInp = 0;
    reconstruction(0, n);

    for(int i = 0; i < n; i++){
      if(i > 0) System.out.print(" ");
      System.out.print(post[i]);
    }

    System.out.println();

  }
}
