import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int window = sc.nextInt();
        int curtain = sc.nextInt();
        int ans = window - curtain * 2;
        System.out.println(ans > 0 ? ans : 0);
    }
}