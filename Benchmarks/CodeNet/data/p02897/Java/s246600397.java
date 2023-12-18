import java.util.Scanner;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solvA(n);
    }

    public static void solvA(int n){
        Double d = (n / 2 + n % 2) / (n * 1.0);
        System.out.println(d);
    }
}
