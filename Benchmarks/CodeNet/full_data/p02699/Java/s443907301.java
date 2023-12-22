import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();
        int W = scanner.nextInt();

        String ans;
        if (S <= W) {ans = "unsafe";}
        else {ans = "safe";}

        System.out.println(ans);

        scanner.close();
    }
}