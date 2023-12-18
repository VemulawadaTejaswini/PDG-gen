import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.skip("0").next();
        System.out.println(s.length());
    }
}
