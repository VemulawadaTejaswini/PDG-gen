import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

class Main
{
    public static void main(int[] args) {
        int a = args[0];
        int b = args[1];
        AtomicBoolean ab = new AtomicBoolean(false);
        IntStream.range(0, (int)Math.pow(10, 9)).forEach(k -> {
            int absA = Math.abs(a - k);
            int absB = Math.abs(b - k);
            if (absA == absB) {
                ab.set(true);
                System.out.println(k);
                return;
            } 
        });
        if (!ab.get()) {
            System.out.println("IMPOSSIBLE");
        }
    }
}
