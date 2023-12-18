
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt() / 1000;
        
        for (int i = n; i >= 0; i--) {
            for (int j = n - i; j >= 0; j--) {
                if (10*i + 5*j + 1*(n-i-j) == y) {
                    System.out.println(i + " " + j + " " + (n-i-j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}