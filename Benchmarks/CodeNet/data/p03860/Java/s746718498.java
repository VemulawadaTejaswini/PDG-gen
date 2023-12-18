
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        s = input.nextLine();
        if ("AtCoder Beginner Contest" == s) {
            System.out.println("ABC");
            System.out.println("The contest in which you are participating now.");
        } else if ("AtCoder Snuke Contest" == s) {
            System.out.println("ASC");
            System.out.println("The contest does not actually exist.");
        } else if ("AtCoder X Contest" == s) {
            System.out.println("AXC");
        }

    }
}