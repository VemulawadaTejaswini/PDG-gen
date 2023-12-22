import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main{
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            int count = 1;
            while((line = stdReader.readLine()) != null) {
                int input = Integer.parseInt(line);
                
                // 0?????\?????????????????????
                if(input == 0) {
                    break;
                }
                
                System.out.println("Case " + count + ": " + input);
                count++;
                
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
}