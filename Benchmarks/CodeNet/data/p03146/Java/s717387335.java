import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int s = scan.nextInt();
        int count = 0;
        int index = 1;
        while(count < 2) {
            index += 1;
            if (s % 2 == 0) {
                s = s / 2;
            } else {
                s = 3 * s + 1;
            }
            if (s == 4) {
                count += 1;
            }
        }
        System.out.println(index);
    }
}
