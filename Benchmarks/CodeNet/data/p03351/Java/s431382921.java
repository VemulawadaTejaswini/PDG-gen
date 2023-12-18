import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sarr = br.readLine().split(" ");
        int[] iarr    = Stream.of(sarr).mapToInt(Integer::parseInt).toArray();
        if (canConverse(iarr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    static boolean canConverse(int[] iarr) {
        int a = iarr[0];
        int b = iarr[1];
        int c = iarr[2];
        int d = iarr[3];
        if (Math.abs(a - c) <= d) {
            return true;
        } else if (Math.abs(a - b) <= d && Math.abs(b - c) <= d ) {
            return true;
        }
        return false;
    }
}
