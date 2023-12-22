import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_8_B
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    
    public static void main(String[] args) {
        try {
            LineNumberReader lineNumReader = new LineNumberReader(
                    new InputStreamReader(System.in));

            String inputStr = null;
            long x = 0;
            int digit = 0;
            int output = 0;
            
            while ((inputStr = lineNumReader.readLine()) != null) {

                output = 0;
                for (int i = 0; i < inputStr.length(); i++) {
                    digit = Integer
                            .parseInt(String.valueOf(inputStr.charAt(i)));
                    output += digit;
                }

                // ????????????
                // ?????°????°?????????????????????????????????§???????????????????????¨?????°????????§???
                if (inputStr.length() == 1) {
                    x = Integer.parseInt(inputStr);
                    if (x == 0) {
                        // do nothing.
                        break;
                    }
                }

                // ??¢???????????????
                System.out.println(output);


            }

            lineNumReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
}