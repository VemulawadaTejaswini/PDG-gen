import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int D = scan.nextInt();
        int x = scan.nextInt();
        for(int j = 1;j <= 10; j++){
            x =  (r * x - D);
            System.out.println(x);
        }

    }
}
