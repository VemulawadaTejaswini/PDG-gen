import java.io.*;

public class Main {

  static int a, b, c, d;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    a = Integer.parseInt(in[0]);
    b = Integer.parseInt(in[1]);
    c = Integer.parseInt(in[2]);
    d = Integer.parseInt(in[3]);

    br.close();

    int cnt = 0;

    while(a > 0 && c > 0){
      if(cnt % 2 == 0){
        c -= b;
      }else{
        a -= d;
      }
      cnt++;
    }

    System.out.println(a <= 0 ? "No" : "Yes");
    
  }
}