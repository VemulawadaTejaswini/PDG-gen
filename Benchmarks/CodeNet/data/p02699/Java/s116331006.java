import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int s = sc.nextInt();
        int w = sc.nextInt();

        if (s > w) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}