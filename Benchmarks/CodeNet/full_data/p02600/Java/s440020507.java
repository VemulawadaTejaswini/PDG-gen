import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        if (n < 600)
            return 8;
        if (n < 800)
            return 7;
        if (n < 1000)
            return 6;
        if (n < 1200)
            return 5;
        if (n < 1400)
            return 4;
        if (n < 1600)
            return 3;
        if (n < 1800)
            return 2;
            return 1;
    }
}