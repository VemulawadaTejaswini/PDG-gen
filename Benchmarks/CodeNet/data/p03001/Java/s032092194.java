import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long W = sc.nextLong();
        long H = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        System.out.print(W*H/2.0);
        System.out.println(" " + ((x==W/2 && y==H/2)? 1:0));
    }
}
