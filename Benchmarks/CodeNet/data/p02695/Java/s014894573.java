import java.io.*;

public class Main {

  static int n, m, q, ans;
  static int[] a, b, c, d, t;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);
    q = Integer.parseInt(in[2]);

    a = new int[q];
    b = new int[q];
    c = new int[q];
    d = new int[q];

    for(int i = 0; i < q; i++){
      in = br.readLine().split(" ");
      a[i] = Integer.parseInt(in[0]);
      b[i] = Integer.parseInt(in[1]);
      c[i] = Integer.parseInt(in[2]);
      d[i] = Integer.parseInt(in[3]);
    }

    br.close();

    t = new int[n];

    makeArr(0, 1);

    System.out.println(ans);
    
    
  }

  static void makeArr(int idx, int mi){

    if(idx == n) {
      calcScore();
      return;
    }

    for(int i = mi; i <= m; i++){
      t[idx] = i;
      makeArr(idx+1, i);
    }

    return;
  }

  static void calcScore(){

    int tmpAns = 0;
    for(int i = 0; i < q; i++){
      if(t[b[i]-1] - t[a[i]-1] == c[i]) tmpAns += d[i];
    }

    ans = Math.max(tmpAns, ans);
  }

}