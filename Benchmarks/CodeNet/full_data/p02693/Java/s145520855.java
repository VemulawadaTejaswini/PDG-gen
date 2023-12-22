
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int k = sc.nextInt();
    static int a = sc.nextInt();
    static int b = sc.nextInt();
    public static void main(String[] args) {
        for (int i = a; a <= b; a++){
            if (a % k == 0){
                System.out.println("OK");
                return;
            }
        }
        System.out.println("NG");

    }
}
