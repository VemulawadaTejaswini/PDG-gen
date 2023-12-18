import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());

        System.out.print(k * (int) (Math.pow(k -1, n -1)));


    }
}
