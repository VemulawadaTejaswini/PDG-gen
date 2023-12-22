import java.io.*;

public class Main {

  static int time;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    time = Integer.parseInt(in[0]);


    br.close();

    int h = time / 3600;
    int m = (time - h * 3600) / 60;
    int s = time % 60;

    System.out.println(h + ":" + m + ":" + s);

  }
}
