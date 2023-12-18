import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if (N % 2 == 0) System.out.println(N);
        else System.out.println(N << 1);
    }
}