
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                long value = Long.parseLong(s.substring(j, i + 1));
                if (value % 2019 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
