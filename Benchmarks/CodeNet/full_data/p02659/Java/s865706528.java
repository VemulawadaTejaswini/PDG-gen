import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        float B = sc.nextFloat();
        //long B1 = (long) B;
        //long B2 = (long) ((B * 100) % 100);

        //long res = (A * B1) + (A * B2) / 100;
        long res = (A * (long)(B * 100)) / 100;

        System.out.println(res);
    }
}

/*
999999999999999 9.99
 */