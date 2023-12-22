import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        switch (S) {
            case "ABC":
                System.out.println("ARC");
            case "ARC":
                System.out.println("ABC");
        }
    }
}
