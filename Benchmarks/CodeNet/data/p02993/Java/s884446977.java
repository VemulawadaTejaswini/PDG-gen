import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].equals(s[i + 1])) {
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");
    }

}
