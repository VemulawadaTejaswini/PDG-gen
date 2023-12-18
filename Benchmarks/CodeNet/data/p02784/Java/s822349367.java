import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hp = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            hp -= sc.nextInt();
            if (hp <= 0)
                break;
        }
        System.out.println(hp <= 0 ? "Yes" : "No");
    }
}