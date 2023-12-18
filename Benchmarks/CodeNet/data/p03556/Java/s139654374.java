
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        long N = Input.nextLong();
        long X = 1;
        long Y = 1;
        while (X * Y <= N) {
            X++;
            Y++;
        }
        if (X * Y <= N) {
            System.out.println(X*Y);
        }else System.out.println((X-1)*(Y-1));
    }
}
