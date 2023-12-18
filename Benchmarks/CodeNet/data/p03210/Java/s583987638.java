import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if( x == 7 || x == 5 || x == 3 ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
