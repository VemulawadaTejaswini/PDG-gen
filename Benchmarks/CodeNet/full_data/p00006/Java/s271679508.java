import java.util.*;
import java.util.Scanner;

public class  Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        StringBuffer str = new StringBuffer(A);
        String B = str.reverse().toString();

        System.out.println(B);

    }
}

