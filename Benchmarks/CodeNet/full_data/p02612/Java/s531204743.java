import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println(new Main().run(sc));
        }
    }

    public String run(Scanner sc) {
        int n = Integer.parseInt(sc.nextLine());
        int i = 1;
        while (true) {
            int payment = i * 1000;
            if (payment >= n) {
                return String.valueOf(payment - n);
            }
            i++;
        }
    }
}
