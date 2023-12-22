import java.util.Scanner;

public class Main {

    private String winner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        String  winner = "";
        while(a > 0 && b > 0) {
            c = c - b;
            if (c <= 0) {
                winner = "Yes";
                break;
            }
            a = a - d;
            if (a <= 0) {
                winner = "No";
                break;
            }
        }

        System.out.println(winner);
    }
}