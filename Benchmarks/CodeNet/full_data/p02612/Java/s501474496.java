import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int modVal = n % 1000;
        if (modVal == 0) {
            System.out.println(0);
        } else {
            System.out.println(1000 - modVal);
        }
    }
}
