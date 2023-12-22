import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long d = in.nextLong();
        long t = in.nextLong();
        long s = in.nextLong();
        long covered = s * t;
        System.out.println(covered >= d ? "Yes" : "No");
        in.close();
    }
}