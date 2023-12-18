import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for(;;) {
            c -= b;
            if(c <= 0){
                System.out.println("Yes");
                return;
            }
            a -= d;
            if(a <= 0){
                System.out.println("No");
                return;
            }
        }
    }
}
