import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(t * s >= d ? "Yes" : "No");
    }
}