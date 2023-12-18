import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        if(Math.abs(a - c) <= d || (Math.abs(a - b) <=d && Math.abs(b - c) <= d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}