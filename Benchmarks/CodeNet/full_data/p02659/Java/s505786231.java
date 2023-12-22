import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        float B = sc.nextFloat();

        B += 0.001;
        B = B * 100;


        long res = (long) (A * (long) B / 100);
        //long res = (A * (long)(B * 100)) / 100;

        System.out.println(res);
    }
}

/*
999999999999999 9.99
 */