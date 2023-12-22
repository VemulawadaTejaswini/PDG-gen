import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long nen = 0;
        long yen = 100;
        for (int i = 1; i <= x; i++) {
            yen = (long)(yen * 1.01);
            if (yen >= x) {
                nen = i;
                break;
            }
        }
        System.out.println(nen);
    }
}

