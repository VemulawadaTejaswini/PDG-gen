import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader stdReader =new BufferedReader(new InputStreamReader(System.in));
      String line0;
      String line1;
      line0 = stdReader.readLine();
      line1 = stdReader.readLine();
    	  int x = Integer.parseInt(line0);
    	  int y = Integer.parseInt(line1);
          System.out.println(x*y+" "+2x+2y);

      stdReader.close();
    } catch (Exception e) {
      e.getStackTrace();
      /*?????´??????0??????*/
      System.exit(0); 
    }
  }
}