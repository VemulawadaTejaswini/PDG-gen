import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer s = new StringBuffer(sc.nextLine());

        if (s.length() == 2) {
            System.out.println(s.toString());
        } else {
            s.reverse();
            System.out.println(s.toString());
        }
    }
}