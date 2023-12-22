import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            int n = input.nextInt();
            if (n == 0) break;
            int sum = 0;
            while (0 != n) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}