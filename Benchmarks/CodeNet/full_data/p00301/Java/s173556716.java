import java.util.Scanner;

// 0306
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        while (n > 0) {
            s = (n % 3 == 0 ? "0" : n % 3 == 1 ? "+" : "-") + s;
            n = n % 3 == 2 ? n / 3 + 1 : n / 3;
        }
        System.out.println(s);
    }
}
