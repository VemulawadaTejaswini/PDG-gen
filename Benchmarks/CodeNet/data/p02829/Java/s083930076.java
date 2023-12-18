import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner io = new Scanner(System.in);
        int a = io.nextInt(), b = io.nextInt();
        System.out.println(a * b / gcd(a, b));
    }
    public static int gcd(int a, int b) {
        return a == 0 ? 0 : gcd(b % a, a);
    }
}
