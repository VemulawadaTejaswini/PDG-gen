import java.io.*;

public class Main {

  static long a, b, n;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    a = Long.parseLong(in[0]);
    b = Long.parseLong(in[1]);
    n = Long.parseLong(in[2]);

    br.close();

    long ans = 0;
    if(n == 0) ans = 0;
    else if(n >= b){
      ans = calcAns(a, b, a-1);
    }else{
      ans = calcAns(a, b, n);
    }
    System.out.println(ans);
    
  }

  static long calcAns(long c, long d, long e){
    return ((c * e) / d) - (c * (e / d));
  }

}