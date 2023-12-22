
import java.util.Scanner;

public class Main {

    /*
     * https://atcoder.jp/contests/abc164/tasks/abc164_a
     */

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        stdIn.close();

        String[] arguments = input.split(" ");
        int sheep = Integer.valueOf(arguments[0]);
        int wolf = Integer.valueOf(arguments[1]);

        if (sheep > wolf) {
            System.out.print("safe");
        } else {
            System.out.println("unsafe");
        }

    }
}