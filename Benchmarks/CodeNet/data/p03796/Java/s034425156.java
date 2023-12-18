
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    //Main
    public static void main(String args[]) throws Exception {

        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        long X = 1;

        for (int I = 1; I <= N; I++) {
            X = (X * I) % 1000000007;
        }
        System.out.println(X);
    }
}