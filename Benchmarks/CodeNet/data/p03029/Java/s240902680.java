
import java.io.*;
import java.util.*;


public class Main {
    static BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader cin  = new BufferedReader(new InputStreamReader(System.in));
    static int[][] arr ;
    static int n, m;

    public static void main(String[] args) throws IOException {
        String[] strs = cin.readLine().split(" ");
        int A = Integer.parseInt(strs[0]);
        int P = Integer.parseInt(strs[1]);
        int pieces = A * 3 + P;
        System.out.println(pieces / 2);
    }


}