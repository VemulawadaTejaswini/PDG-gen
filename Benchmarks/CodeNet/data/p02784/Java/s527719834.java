import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int h = stdIn.nextInt();
        int n = stdIn.nextInt();

        int totalAttack = 0;
        for (int i = 0; i < n; i++) {
            totalAttack += stdIn.nextInt();
        }

        if (totalAttack >= h) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
