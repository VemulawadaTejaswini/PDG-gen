
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        int c = a - 1;
        
        int count = 0;
        if (b > 1) {
            count++;
        }
        
        while (a < b) {
            a += c;
            count++;
        }
        
        System.out.println(count);
    }
    
}
