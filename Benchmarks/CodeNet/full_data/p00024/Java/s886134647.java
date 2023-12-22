import java.util.*;

public class Main {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            double v = 0;
            double t = 0;
            int N = 0;
            
            v = scanner.nextDouble();
            t = v/9.8;
            N = (int)Math.ceil( 4.9*Math.pow(t, 2)/5 + 1);
            
            System.out.println(N);
        
        }
    }
}