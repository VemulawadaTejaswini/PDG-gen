import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        for(int i = 1; ; ++i) {
            int n = ReadInt();
            if( n == 0 ) break;
            System.out.println("Case " + i + ": " + n);
        }
    }
    static int ReadInt() throws IOException {
        return Integer.parseInt(sc.next());
    }
}