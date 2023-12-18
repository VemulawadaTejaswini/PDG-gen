import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();
        long W = sc.nextLong();


        long first = W % 2 == 1 ? W / 2 + 1 : W / 2;
        long second = (W - 1) % 2 == 1 ? (W - 1) / 2 + 1 : (W - 1) / 2;

        long fr = H % 2 == 1 ? H / 2 + 1 : H / 2;
        long sr = (H - 1) % 2 == 1 ? (H - 1) / 2 + 1 : (H - 1) / 2;

        System.out.println(fr * first + sr * second);
    }
}