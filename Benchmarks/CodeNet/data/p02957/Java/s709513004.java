import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class Hoge
{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int k = 0;
        for (k=0; k<1000000000; k++) {
            int absA = Math.abs(a - k);
            int absB = Math.abs(b - k);
            if (absA == absB) {
                System.out.println(k);
                break;
            } 
        }
        if (k == 0) {
            System.out.println("IMPOSSIBLE");
        }
    }
}
