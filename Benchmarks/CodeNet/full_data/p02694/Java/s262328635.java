import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long deposit = 100;
        int year = 0;
        
        while (true) {
            year++;
            deposit += deposit * 0.01;
            if (X <= deposit) {
                break;
            }
        }
        
        System.out.println(year);
    }
}
