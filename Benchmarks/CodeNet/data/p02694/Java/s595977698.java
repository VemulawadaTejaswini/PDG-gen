import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        int deposit = 100;
        int year = 0;
        
        while (year < 3760) {
            deposit += Math.floor(deposit * 0.01);
            
            if (X <= deposit) {
                break;
            }
            
            year++;
        }
        System.out.println(year);
    }
}
