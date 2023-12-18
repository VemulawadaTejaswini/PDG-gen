import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();
        int ans = a - (b < a ? 1 : 0);
        System.out.println(ans);
    }
}
