import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("整数の値を入力してください");
        int r = scanner.nextInt();
        double area = Math.pow(r, 3);
        System.out.println("半径" + r + "の円に内接する正十二角形の面積は" + area + "です");
    }
}