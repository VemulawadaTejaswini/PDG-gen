import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char max = n.charAt(0);
        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) >= max) {
                max = n.charAt(i);
                continue;
            }
        }
        for (int i = 0; i < n.length(); i++) {
            System.out.print(max);
        }
        System.out.println();
    }
}
