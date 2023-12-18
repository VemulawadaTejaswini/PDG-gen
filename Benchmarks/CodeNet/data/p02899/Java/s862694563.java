
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] as = new int[n];
        
        int[] outputs = new int[n];
        
        for (int i = 0; i < n; i ++) {
            as [i] = s.nextInt();
            outputs [as [i] - 1] = i + 1;
        }
        
        for (int i : outputs) {
            System.out.print(i);
            System.out.print(" ");
        }
        
    }
    
}
