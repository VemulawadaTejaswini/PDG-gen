
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        double r = in.nextDouble();
        out.println(2.0 * Math.PI * r);
        out.close();
    }
}