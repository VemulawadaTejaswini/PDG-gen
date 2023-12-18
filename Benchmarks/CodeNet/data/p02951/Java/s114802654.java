import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int result = 0;
        if (c - (a - b) >= 0) result = c - (a - b);
        System.out.println(result);
    }
}
