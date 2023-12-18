import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int count = 0;

        for (char a : N.toCharArray()) {
            if (a == '7') {
                count += 1;
            }
        }
        if (count != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}