import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        String s = String.valueOf(a) + String.valueOf(b);

        int c = Integer.parseInt(s);

        for (int i = 1; i < c; i++) {
            if (c / i == c)
                System.out.println("Yes");
        }

        System.out.println("No");
    }
}