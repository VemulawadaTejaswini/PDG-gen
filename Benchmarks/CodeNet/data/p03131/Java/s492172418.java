import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in;
    in = br.readLine().split(" ");
    long k = Long.parseLong(in[0]);
    long a = Long.parseLong(in[1]);
    long b = Long.parseLong(in[2]);

    br.close();

    long ans = k + 1;

    if(b > a + 2 && k > a){
      ans = a + (k - a + 1) / 2 * (b - a);
      ans += (k - a - 1) % 2;
    }

    System.out.println(ans);
    
  }
}