import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = 0;
        if (a==b) ans = 2 * a;
        else ans = 2 * a -1;
        
        System.out.println(ans);

    }

}
