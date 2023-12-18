import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        long X1=0, Y1=0, X2,Y2,X3,Y3;
        // S = abs(X2 * Y3 - X3 * Y2)
        X2 = 1000000000;
        Y3 = (S+X2-1) / X2;

        X3 = 1;
        Y2 = (X2*Y3-S)/X3;
        System.out.printf("%d %d %d %d %d %d\n", X1, Y1, X2, Y2, X3, Y3);
    }
}