import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int res = i / 2;
        res += (i % 2);
        System.out.println(res);
    }
}