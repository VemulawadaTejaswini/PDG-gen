import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a < b){
            for (int i = 0; i < b; i++) {
                System.out.printf("%d", a);
            }
            return;
        }
        for (int i = 0; i < a; i++) {
            System.out.printf("%d", b);
        }
    }
}
