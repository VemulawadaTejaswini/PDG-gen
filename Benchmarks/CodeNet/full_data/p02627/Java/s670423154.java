import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String match1 = "[A-Z]";
        String match2 = "[a-z]";

        if (a.matches(match1)) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }

    }
}