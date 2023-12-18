
package competitiveprogramming;

import java.util.Scanner;

public class CompetitiveProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        
        long smallest = Long.MAX_VALUE;
        
        for (int i = 0; i < 5; i ++) {
            long in = s.nextLong();
            if (in < smallest)
                smallest = in;
        }
        
        long div;
        
        if (n % smallest == 0)
            div = n / smallest;
        else
            div = n / smallest + 1;
        
        
        System.out.println(div + 4);
        
    }
    
}
