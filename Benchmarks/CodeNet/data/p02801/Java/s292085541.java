import java.io.IOException;
import java.util.Scanner;

class NextAlphabet {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char c = (char) System.in.read();
        int b = c + 1;
        c =(char)b;
        System.out.println(c);
    }
}