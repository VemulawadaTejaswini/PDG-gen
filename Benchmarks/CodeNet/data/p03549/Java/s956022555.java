import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static int[][] label;


    static ArrayList<String> list;

    static int M;
    static int N;
    static int T;
    static int P;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        System.out.println((int) Math.pow(2, M) * ((1900 * M) + (N - M) * 100));

    }



}
