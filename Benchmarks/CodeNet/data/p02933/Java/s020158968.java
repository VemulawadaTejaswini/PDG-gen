import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = Integer.parseInt(sc.nextLine());
            String s = a >= 3200 ? sc.nextLine() : "red";
            System.out.println(s);
        }
    }
}
