import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        long ans = 1L * n * (n - 1) >> 1;
        System.out.println(ans);
    }
}
