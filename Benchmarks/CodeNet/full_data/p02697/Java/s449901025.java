import java.io.*;

public class Main {

  static int n, m;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);

    br.close();

    if(n % 2 == 1){
      for(int x = 1; x <= m; x++){
        System.out.println(x + " " + (2 * m + 1 - x));
      }
    }else if(n == 4){
      System.out.println(2 + " " + 3);
    }else{
      System.out.println(1 + " " + (2 * m + 1));
      for(int x = 3; x <= m + 1; x++){
        System.out.println(x + " " + (2 * m + 3 - x));
      }
    }
    
  }

}