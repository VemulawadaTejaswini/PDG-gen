import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            
            if (left == 0 && right == 0) {
                break;
            }
            
            if (right < left) { 
                int tmp = 0; 
                tmp = right; 
                right = left; 
                left = tmp; 
            }
            
            System.out.printf("%d %d\n", left, right);
            
            
        }
        
        
    }
}
