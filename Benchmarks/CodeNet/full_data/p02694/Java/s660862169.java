
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long x = sc.nextLong();
    public static void main(String[] args) {
        int year = 0;
        long money = 100;
        while (money < x){
            money = money + (money / 100);
            year++;
        }
        System.out.println(year);
    }
}
