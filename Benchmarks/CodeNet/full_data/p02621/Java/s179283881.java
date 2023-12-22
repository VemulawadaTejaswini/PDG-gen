import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int ans = t+(int)Math.pow(t,2)+(int)Math.pow(t,3);
        System.out.println(ans);
    }
}