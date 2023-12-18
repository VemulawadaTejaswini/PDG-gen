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
            else if (i + 1 == c)
                System.out.println("No");
        }
    }
}