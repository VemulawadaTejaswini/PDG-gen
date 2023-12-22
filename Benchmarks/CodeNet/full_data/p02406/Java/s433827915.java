import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @param args
 */
public class Main {
    static final String HASHMARK = "#";
    static final String DOTMARK  = ".";
    static final String SPACE    = " ";
    
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            while ((sStr = stdReader.readLine()) != null) {
                String[] inputs = sStr.split(" ");
                
                int n = Integer.valueOf(inputs[0]);
                call(n);
            }
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
    
    private static void call(int n) {
        int i = 1;
        boolean flg = false;
        
        while (true) {
            // CHECK_NUM:
            int x = i;
            if (x % 3 == 0) {
                System.out.print(SPACE + i);
                if (++i <= n) {
                    continue;
                } else {
                    break;
                }
            }
            
            // INCLUDE3:
            do {
                if (x % 10 == 3) {
                    System.out.print(SPACE + i);
                    if (++i <= n) {
                        flg = true;
                        break;
                    }
                }
                x /= 10;
            } while (0 != x && x < 10);
            if (flg) {
                flg = false;
                continue;
            }
            if (++i <= n)
                continue;
        }
        
        System.out.println();
    }
}