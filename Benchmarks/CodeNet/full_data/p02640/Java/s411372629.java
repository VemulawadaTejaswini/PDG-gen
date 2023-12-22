import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String result = "No";
        if (4*x-y >= 0) {
            if ((4*x-y)%2 == 0) {
                if (y-2*x >= 0) {
                    if ((y-2*x)%2 == 0) {
                        result = "Yes";
                    }
                }
            }
        }
        System.out.println(result);
    }
}