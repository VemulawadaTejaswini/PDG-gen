import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> in;
        in = new ArrayList<>();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            Long number = scanner.nextLong();
            if (in.contains(number)) {
                in.remove(number);
            } else {
                in.add(number);
            }
        }
        System.out.println(in.size());
    }
}