import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int x = 1;
        int result = 0;
        while (x < B) {
            x += (A - 1);
            result++;
        }
        System.out.println(result);
    }
}