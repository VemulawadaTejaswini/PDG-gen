import java.util.*;
import java.io.*;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        for (int i  = 0; i < n; ++i)
            in.nextInt();

        System.out.println(n / (k - 1));
    }
}