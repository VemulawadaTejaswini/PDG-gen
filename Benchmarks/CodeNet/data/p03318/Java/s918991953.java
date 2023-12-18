import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int k = reader.nextInt();
        int n = 1;
        for (int i = 0; i < k; i++) {
            System.out.println(n);
            n += n < 9 ? 1 : 10;
        }
    }
}