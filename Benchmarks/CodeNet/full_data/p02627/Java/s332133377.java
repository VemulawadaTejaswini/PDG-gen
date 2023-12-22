import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println(new Main().run(sc));
        }
    }

    public String run(Scanner sc) {
        String a = sc.nextLine();
        String lowercase = a.toLowerCase();
        return a.equals(lowercase) ? "a" : "A";
    }
}
