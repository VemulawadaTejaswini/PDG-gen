import java.io.*;
import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int s = ReadInt();
        System.out.print(s / 3600 + ":" + s / 60 % 60 + ":" + s % 60 + "\n");
    }
    static int ReadInt() throws IOException {
        return Integer.parseInt(sc.next());
    }
}