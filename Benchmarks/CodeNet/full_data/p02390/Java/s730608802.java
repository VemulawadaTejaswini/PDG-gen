
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leftSeconds = Integer.parseInt(sc.nextLine());
        int hour = 60 * 60;
        int hours = leftSeconds/ hour;
        leftSeconds = leftSeconds % hour;
        int minute = 60;
        int minutes = leftSeconds / minute;
        leftSeconds = leftSeconds % minute;
        System.out.println(hours + ":" + minutes + ":" + leftSeconds);
    }
}
