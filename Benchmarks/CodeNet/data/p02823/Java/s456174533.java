import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long diff = a - b;
        if(diff < 0) diff *= -1L;
        diff += 1;
        System.out.println(diff / 2);
        sc.close();

    }

}
