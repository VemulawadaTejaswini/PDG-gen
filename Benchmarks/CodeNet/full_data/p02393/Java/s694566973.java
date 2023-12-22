import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp;

        //1番目の数と2 番目の数を比べて逆順ならば交換する
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        //2番目の数と3番目の数を比べて逆順ならば交換する
        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }

        //1番目の数と2番目の数を比べて逆順ならば交換する
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
