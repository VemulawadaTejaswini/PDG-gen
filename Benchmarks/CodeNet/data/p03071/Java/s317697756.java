import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for (int i=0; i<2; i++) {
            if (a > b) {
                sum += a;
                a--;
            } else {
                sum += b;
                b--;
            }
        }

        System.out.println(sum);
    }
}
