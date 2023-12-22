import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long base = 100;
        long time = 0;
        while (base < x) {
            time++;
            base += base / 100;
        }
        System.out.println(time);
    }
}