import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String result = "No";
      String inStr  = br.readLine();
      String target = br.readLine();
      String ring = inStr + inStr;

      if( inStr.length() >= target.length())
        for(int i = 0; i < inStr.length(); i++) {
          if( target.charAt(0) == ring.charAt(i) ){
            if(target.equals(ring.substring(i, i+target.length()))) {
              result = "Yes";
              break;
            }
          }
        }

      System.out.println(result);
    }
  }
}
