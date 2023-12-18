
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count500 = 0;
        int count5 = 0;
        while (num >= 500) {
            num = num - 500;
            count500++;
        }
        while (num >= 5){
            num = num - 5;
            count5++;
        }
        System.out.println(count500 * 1000 + count5 * 5);
    }
}
