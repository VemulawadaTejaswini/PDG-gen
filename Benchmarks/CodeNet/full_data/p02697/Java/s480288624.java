import java.io.*;

public class Main {

  static int n, m;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);

    br.close();

    if(m % 2 == 1){
      for(int x = 1; x <= m/2; x++){
        System.out.println(x + " " + (m + 1 - x));
      }
      for(int x = m + 1; x <= m + 1 + m / 2; x++){
        System.out.println(x + " " + (3 * m + 2 - x));
      }
    }else{
      for(int x = 1; x <= m/2; x++){
        System.out.println(x + " " + (m + 2 - x));
      }
      for(int x = m + 2; x <= m + 1 + m / 2; x++){
        System.out.println(x + " " + (3 * m + 3 - x));
      }
    }
    
  }

}