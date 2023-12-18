import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int extra = (a * b) % 2;
        if (extra == 1) {
            System.out.println("Odd");
        } else if (extra == 0) {
            System.out.println("Even");
        }
    }
}