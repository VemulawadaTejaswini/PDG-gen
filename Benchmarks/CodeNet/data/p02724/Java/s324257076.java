import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int c500 = X / 500; // 500円枚数
        int c = X % 500;
        int c5 = c / 5; // 5円枚数

        System.out.print((c500*1000) + (c5*5));
    }
}