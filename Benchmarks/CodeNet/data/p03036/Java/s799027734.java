import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        
        for (int i = 1; i <= 10 ; i++){
            int temp = r * x - d;
            x = temp;
            System.out.println(x);
        } 
    }
}
