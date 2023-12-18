import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int x = n * 800;
        int y = (n/15) * 200;
        
        System.out.println(x - y);
    }
}
