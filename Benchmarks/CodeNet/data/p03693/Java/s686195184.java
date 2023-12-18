import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int all = 100 * r + 10 * g + b;
        System.out.println(all % 4 == 0 ? "Yes" : "No");
    }
}