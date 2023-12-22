import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        long s = sc.nextLong();
        long h = s / 3600;
        long m = (s % 3600) / 60;
        s = s % 60;
        System.out.println (h + ":" + m + ":" + s);
    }
}
