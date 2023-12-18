import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int len = str.length();
        for (int i = 0; i < len; i ++)
            System.out.print("x");
    }
}
