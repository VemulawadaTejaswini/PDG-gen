import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        if(a == b && b == c || a != b && b != c && a != c) System.out.println("No");
        else System.out.println("Yes");
    }
}
