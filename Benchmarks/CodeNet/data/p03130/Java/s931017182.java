import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int[] cnt = new int[5];

    String[] in;

    for(int i = 0; i < 3; i++){
      in = br.readLine().split(" ");
      int a = Integer.parseInt(in[0]);
      int b = Integer.parseInt(in[1]);
      cnt[a]++;
      cnt[b]++;
    }

    br.close();

    boolean ok = true;

    for(int i = 1; i < 4; i++){
      if(cnt[i] > 2) ok = false;
    }

    System.out.println(ok ? "YES" : "NO");
    
  }
}