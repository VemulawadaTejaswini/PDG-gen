import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String answer = "APPROVED";
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            if ((num % 2) != 0) {
                continue;
            }
            if (((num % 3) == 0) || ((num % 5) == 0)) {
                continue;
            } else {
                answer = "DENIED";
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
