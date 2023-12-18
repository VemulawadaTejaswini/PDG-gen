import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        
        int app = scanner.nextInt();
        int app_pc = scanner.nextInt();
        
        long sum = (app * 3 + app_pc)/2; 
        System.out.println(sum);
    }
}
