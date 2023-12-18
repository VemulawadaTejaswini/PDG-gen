import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int x = kbd.nextInt();
        int count = 0;
        int d = 0;
        int i = 0;
        while (x >= d && i < n) {
            if (i == 0) {
                d = 0;
                count++;
            } else {
                int temp = d + kbd.nextInt();
                if (temp > x) {
                    break;
                } else {
                    d = temp;
                    count++;
                }
            }
            i++;
        }
        System.out.println(count);
    }
}