import java.util.*;

public class Main {
    public static void main(String[] arg) {
        int h = Integer.parseInt(argStr[0]);
        int a = Integer.parseInt(argStr[1]);

        int count = 0;
        while(h > 0) {
            h = h-a;
            count++;
        }

        System.out.println(count);
    }
}
