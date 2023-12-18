import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    int h = Integer.parseInt(in[1]);
    int w = Integer.parseInt(in[2]);

    int[] a = new int[n], b = new int[n];
    for(int i = 0; i < n; i++){
      in = br.readLine().split(" ");
      a[i] = Integer.parseInt(in[0]);
      b[i] = Integer.parseInt(in[1]);
    }
    
    br.close();

    int ans = 0;
    for(int i = 0; i < n; i++){
      if(a[i] >= h && b[i] >= w) ans++;
    }

    System.out.println(ans);
  }
}