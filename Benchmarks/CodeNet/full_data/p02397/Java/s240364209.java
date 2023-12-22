import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    private final static String SPACE = " ";
    
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            while ((sStr = stdReader.readLine()) != null) {
                String[] inputs = sStr.split(" ");
                
                int x = Integer.valueOf(inputs[0]);
                int y = Integer.valueOf(inputs[1]);
                
                if (x < y) {
                    System.out.print(x);
                    System.out.print(SPACE);
                    System.out.print(y);
                    System.out.println();
                } else if (x == 0 && y == 0) {
                    break;
                    // nothing to do
                } else {
                    System.out.print(y);
                    System.out.print(SPACE);
                    System.out.print(x);
                    System.out.println();
                }
            }
            
            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}