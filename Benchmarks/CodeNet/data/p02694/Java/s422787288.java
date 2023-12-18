import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        int deposit = 100;
        int year = 0;
        
        while (true) {
            deposit += Math.floor(deposit * 0.01);
            year++;
            
            if (X <= deposit) {
                break;
            }
        }
        System.out.println(year);
        
    }
}
