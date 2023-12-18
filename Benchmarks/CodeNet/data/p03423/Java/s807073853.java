import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String buf = br.readLine();
            
            int n = Integer.parseInt(buf);
            
            int result = n / 3;
            
            System.out.println(result);
            
        } catch (Exception e) {
          e.getStackTrace();
          System.exit(-1); // プログラムを終了
        }
        
    }
}
