import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(abc058_a(sc.next(),sc.next(),sc.next()));
    }

    static String abc058_a(int a, int b, int c) {
        if (b - a == c - b) {
            return "YES";
        }
        return "NO";
    }

}
