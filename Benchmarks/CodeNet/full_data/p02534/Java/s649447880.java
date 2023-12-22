import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long A = 0, B = 0, C = 0, D = 0;
        Scanner scan = new Scanner(System.in);
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        scan.close();
        if (C >= A && C <= B)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}