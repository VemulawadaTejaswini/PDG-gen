import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int A;
        int B;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();

        if (A > 8 || B > 8) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}
