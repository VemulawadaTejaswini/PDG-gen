import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = Integer.parseInt(s.next());
        int X = Integer.parseInt(s.next());
        System.out.println((double) T / (double) X);
    }
}