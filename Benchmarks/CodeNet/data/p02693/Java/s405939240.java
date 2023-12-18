import java.io.*;

public class Main {

  static int k, a, b;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    k = Integer.parseInt(in[0]);
    in = br.readLine().split(" ");
    a = Integer.parseInt(in[0]);
    b = Integer.parseInt(in[1]);

    br.close();

    boolean ok = false;

    for(int i = a; i <= b; i++){
      if(i % k == 0) ok = true;
    }

    System.out.println(ok ? "OK" : "NG");
    
    
  }

}