import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        if (a < 1200) {
            System.out.println("ABC");
        } else if (a <2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}