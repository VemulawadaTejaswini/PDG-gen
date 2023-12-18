import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int window = sc.nextInt();
        int curtain = sc.nextInt();
        if (window <= (curtain * 2) ) {
            System.out.println(0);
        } else {
            System.out.println(window - (curtain * 2));
        }
    }
}
