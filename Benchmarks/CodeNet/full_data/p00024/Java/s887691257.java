import java.util.*;

public class Main {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            double v = 0;
            double t = 0;
            double y = 0;
            int N = 0;
            
            v = scanner.nextDouble();
            t = v/9.8;
            y = 4.9 * t* t;
            N = (int)Math.ceil((y+5)/5);
            
            System.out.println(N);
        
        }
    }
}