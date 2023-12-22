import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      while(true){
        String line = br.readLine();
        if(line.equals("0")) break;

        int sum = 0;
        char[] ch   = line.toCharArray();
        
        for( int i = 0; i < line.length(); i++ )  {
          sum += Character.getNumericValue(ch[i]);
        }

        System.out.println(sum);
      }
    }
  }
}
