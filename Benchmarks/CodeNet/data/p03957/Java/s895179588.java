import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            int indexOfC = s.indexOf('C');
            int indexOfF = s.lastIndexOf('F');
            System.out.println((indexOfC >= 0 && indexOfF >= 0 && indexOfC < indexOfF) ? "Yes" : "No");
        }
    }
}
