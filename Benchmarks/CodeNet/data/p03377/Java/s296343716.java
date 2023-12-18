import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        
        String result = "NO";
        if (a <= x && x <= b) result = "YES";
        
        System.out.println(result);
    }
}
