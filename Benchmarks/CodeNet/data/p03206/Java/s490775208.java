import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int d = std.nextInt();
        StringBuilder ans = new StringBuilder("Christmas");
        int diff = 25 - d;
        for (int i = 0; i < diff; i++) {
            ans.append(" Eve");
        }

        System.out.println(ans.toString());
    }
}
