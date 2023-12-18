import java.io.*;

public class Main {

  static long x;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    x = Long.parseLong(in[0]);

    br.close();

    long i = -1000, j = -1000;
    boolean ok = false;

    for(i = -1000; i <= 1000; i++){
      for(j = -1000; j <= 1000; j++){
        if(gj(i) - gj(j) == x) {
          ok = true;
          break;
        }
      }
      if(ok) break;
    }

    PrintWriter out = new PrintWriter(System.out);
    out.println(i + " " + j);
    out.flush();

  }

  static long gj(long a){
    return a * a * a * a * a;
  }
}