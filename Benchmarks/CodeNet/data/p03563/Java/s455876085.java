import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();

        int ans = (g * 2) - r;
        System.out.println(ans);
    }
}
