import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab = (scanner.nextInt() + scanner.nextInt()) / 2;
        Double result = Math.ceil(ab);

        System.out.println(result.intValue());

    }
}
