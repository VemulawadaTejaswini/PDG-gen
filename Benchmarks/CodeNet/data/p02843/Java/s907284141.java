import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        //最大で購入可能な個数を算出
        int max = x / 100;

        //最大で購入可能な金額誤差
        int max_d = max * 5;

        int xd = x - max * 100;

        if (max_d >= xd){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}