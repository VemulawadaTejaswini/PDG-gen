import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        System.out.println(String.valueOf(n).contains("7") ? "Yes" : "No");
    }
}
