import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        String s = "1x1=1";
        String tmp = "x=";
        IntStream.range(1, 10).forEach(
                n1 -> {
                    IntStream.range(1, 10).forEach(
                            n2 -> {
                                System.out.println(n1 + "x" + n2 + "=" + (n1 * n2));
                            }
                    );
                }
        );
    }
}