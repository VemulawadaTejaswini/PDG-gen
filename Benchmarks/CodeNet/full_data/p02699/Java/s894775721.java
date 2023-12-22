import java.util.Scanner;

public class abc164_a {
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