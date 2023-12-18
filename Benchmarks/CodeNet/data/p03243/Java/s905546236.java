import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  =sc.nextInt();

        int hoge = n / 100;
        if (n - hoge * 100 >= 50) {
            hoge++;
        }
        
        int reNum = hoge + hoge * 10 + hoge * 100;
        System.out.println(reNum);
    }
}