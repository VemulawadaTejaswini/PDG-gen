import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String contest = scan.nextLine();
        if(contest.equals("ABC")) {
            System.out.println("ARC");
            scan.close();
            return;
        } else {
            System.out.println("ABC");
            scan.close();
            return;
        }
    }
}