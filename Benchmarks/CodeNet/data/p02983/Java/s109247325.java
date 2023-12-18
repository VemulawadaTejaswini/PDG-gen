import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());

        int min = 2019;
        for (int i = l; i < r; i++) {
            for (int j = i + 1; j <= r; j++) {
                if ((i * j) % 2019 < min) {
                    min = (i * j) % 2019;
                }
            }
        }
        System.out.print(min);
    }
}