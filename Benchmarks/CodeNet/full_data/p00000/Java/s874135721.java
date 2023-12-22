import java.util.stream.IntStream;

public class Main {
    static int[] baseNumbers = {1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) {
        IntStream.of(baseNumbers).forEach(n -> IntStream.of(baseNumbers).forEach(m -> System.out.println(n + "x" + m + "=" + (n*m))));
    }
}