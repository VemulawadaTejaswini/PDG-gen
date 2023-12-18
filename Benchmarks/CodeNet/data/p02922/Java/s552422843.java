import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int now = 0;
        int count = 0;
        while (true) {
            now += a;
            count++;
            if (now >= b) {
                break;
            } else {
                now--;
            }
        }
        System.out.print(count);
    }
}