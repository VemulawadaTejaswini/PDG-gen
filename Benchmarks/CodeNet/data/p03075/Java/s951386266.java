import java.util.Scanner;

class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        String result = (e-a <= sc.nextInt()) ? "Yay!" : ":(";
        System.out.println(result);
    }
}