import java.util.Scanner;

public class Main {
    public static void abc173_a() {
        try (Scanner sc = new Scanner(System.in)) {
            int a = Integer.parseInt(sc.next());
            int change = a % 1000;
            if (change == 0)
                System.out.println(0);
            else
                System.out.println(1000 - change);
        }
    }


    public static void main(String[] args) {
        abc173_a();
    }
}