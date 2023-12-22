import java.util.Scanner;

class Main {
    public static int solve(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b =  sn.nextInt();
        System.out.println(solve(a, b));
    }
}