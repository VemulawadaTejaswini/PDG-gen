import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        sc.close();

        long l = 0;
        long d = 100;
        while (true) {
            d = (long) (d * 1.01);
            l++;
            if (d >= x) {
                break;
            }
        } 
        System.out.println(l);
    }
}
