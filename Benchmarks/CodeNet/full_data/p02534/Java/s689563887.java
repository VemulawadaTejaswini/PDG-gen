import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long A = 0l, B = 0l, C = 0l, D = 0l;
        Scanner scan = new Scanner(System.in);
        try {
            A = scan.nextLong();
            B = scan.nextLong();
            C = scan.nextLong();
            D = scan.nextLong();
        } catch (Exception e) {
            scan.close();
            return;
        }
        scan.close();
        // C >= A && C <= B || C <= A && D >= B ||
        if (C <= A && D >= A)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}