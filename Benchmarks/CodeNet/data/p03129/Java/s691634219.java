import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt();
        int last = 1 + (k-1)*2;
        System.out.println(last > n ? "NO" : "YES");
    }
}
