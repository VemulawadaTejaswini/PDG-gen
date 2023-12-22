import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        long a = Long.parseLong(in.next());
        long b = Long.parseLong(in.next());

        System.out.println(a/b + " " + a%b + " " + (float)a/b);
    }
}