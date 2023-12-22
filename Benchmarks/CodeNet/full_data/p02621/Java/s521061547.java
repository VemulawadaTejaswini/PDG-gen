import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println(new Main().run(sc));
        }
    }

    public String run(Scanner sc) {
        int a = Integer.parseInt(sc.nextLine());
        return String.valueOf(a + a*a + a*a*a);
    }
}
