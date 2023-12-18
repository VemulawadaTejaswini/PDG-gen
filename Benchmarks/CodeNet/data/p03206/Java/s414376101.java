import java.util.Scanner;

/***/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();

        String out = "Christmas";

        int count = Math.abs(25 - in);
        while (count != 0) {
            out += " Eve";
            count--;
        }

        System.out.println(out);
    }
}