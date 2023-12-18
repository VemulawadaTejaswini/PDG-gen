import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt(), n = in.nextInt();
        if(d == 0) {
            System.out.println(n == 100 ? 101 : n);
        }else if (d == 1) {
            System.out.println(n == 100 ? 10100 : n * 100);
        }else {
            System.out.println(n == 100 ? 1000100 : n * 10000);
        }
    }
}