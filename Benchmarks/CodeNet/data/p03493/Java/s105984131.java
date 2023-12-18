import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int hyaku = n / 100;
        int juu = n / 10 % 10;
        int iti = n % 10;
        System.out.println(hyaku + juu + iti);
    }
}