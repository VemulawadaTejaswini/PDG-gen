import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = n*2;
        if (n % 2 == 0) result = n;
 
        System.out.println(result);
    }
}
