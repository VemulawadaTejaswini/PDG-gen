import java.util.*;

public class Main {
    public static String main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return (a * b) % 2 == 0 ? "Even" : "Odd";
    }

}
