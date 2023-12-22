import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run () {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x * x * x);
    }

}