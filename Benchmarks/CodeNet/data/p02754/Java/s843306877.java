import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        int blue = sc.nextInt();
        int red = sc.nextInt();
        
        if (blue == 0) {
            System.out.println(0);
        } else {
            System.out.println(all - red);
        }
    }
}