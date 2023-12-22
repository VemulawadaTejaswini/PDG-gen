import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int a = ReadInt();
        int b = ReadInt();
        int c = ReadInt();
        int res = 0;
        for(int i = a; i <= b; ++i) {
            if( c % i == 0 ) res += 1;
        }
        System.out.println(res);
    }
    static int ReadInt() throws IOException {
        return Integer.parseInt(sc.next());
    }
}