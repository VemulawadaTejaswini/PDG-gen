import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int a = money / 1000;
        a++;
        System.out.println(Math.abs(a * 1000 - money));
    }
}