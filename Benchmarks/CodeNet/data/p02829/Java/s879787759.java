import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        System.out.println(IntStream.of(1, 2, 3).filter(x -> x != A && x != B).toArray()[0]);
    }

}