import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        long n = sc.nextLong();
        if(d == 0) {
            System.out.println(n);
        } else if(d == 1) {
            System.out.println(100l * n);
        } else if(d == 2) {
            System.out.println(100l * 100l * n);
        }
    }
}