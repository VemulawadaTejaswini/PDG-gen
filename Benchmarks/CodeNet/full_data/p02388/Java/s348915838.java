import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.next());
        System.out.println(x ^ 3);
    }
}