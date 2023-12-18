import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        int s = sc.nextInt();
        // get two integers separated with half-width break
        int w = sc.nextInt();
        String str = (s <= w) ? "unsafe" : "safe";
        System.out.println(str);
    }
}