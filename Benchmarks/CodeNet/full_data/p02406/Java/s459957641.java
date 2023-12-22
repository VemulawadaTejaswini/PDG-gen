import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            
            String line;
            
            while((line = stdReader.readLine()) != null) {
                int n = Integer.parseInt(line);
                call(n);
                
            }
            stdReader.close();
        } catch(Exception e) {
            e.getStackTrace();
            System.exit(-1);
        }
    }
    
    private static void call(int n) {
        int x;
        for(int i = 1; i <= n; i++) {
            x = i;
            if(x % 3 == 0) {
                System.out.print(" " + i);
                continue;
            }
            while(x != 0) {
                if(x % 10 == 3) {
                    System.out.print(" " + i);
                    
                    break;
                }
                x /= 10;
            }
        }
        System.out.println();
    }
}