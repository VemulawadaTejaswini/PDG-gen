import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int result = 0;
        for (int i = 999; i >= 111; i -= 111) {
            if (n > i) {
                result = i + 111;
                break;
            } else if (n == i) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}