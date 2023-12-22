import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roop = 1;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;

            }
            System.out.println("Case " + roop +": " + n);
            roop++;
        }
    }
}