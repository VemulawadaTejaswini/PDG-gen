import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
  public static void main(String[] args) throws Exception{
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String line;
      line = in.readLine();
      System.out.println(Integer.parseInt(line)^3);
      in.close();
    } catch (Exception e) {
      e.getStackTrace();
      System.exit(-1); // ????????°???????????????
    }
  }
}