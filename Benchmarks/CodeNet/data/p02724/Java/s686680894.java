import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int happy = 0;
        
        happy += X / 500 * 1000;
        X = X % 500;
        happy += X / 5 * 5;
        
        System.out.println(happy);
    }
}
