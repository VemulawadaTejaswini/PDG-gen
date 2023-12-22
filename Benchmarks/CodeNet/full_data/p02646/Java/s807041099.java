
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        String[] str1 = c.nextLine().split(" ");
        String[] str2 = c.nextLine().split(" ");
        String str3 = c.nextLine();

        long firstPositionA = Long.parseLong(str1[0]);
        long firstPositionB = Long.parseLong(str2[0]);
        long v = Long.parseLong(str1[1]);
        long w = Long.parseLong(str2[1]);
        long t = Long.parseLong(str3);

        if (Math.abs(firstPositionB - firstPositionA) <= Math.abs((w - v) * t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
