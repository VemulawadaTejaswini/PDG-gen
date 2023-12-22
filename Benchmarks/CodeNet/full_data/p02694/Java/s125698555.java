import java.io.*;

public class Main {

  static long x;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    x = Long.parseLong(in[0]);

    br.close();

    long m = 100L;
    int ans = 0;
    while(m < x){
      m += m / 100;
      ans++;
    }

    System.out.println(ans);
    
  }

}