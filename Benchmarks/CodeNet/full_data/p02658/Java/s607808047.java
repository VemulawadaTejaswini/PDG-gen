import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputList.add(scanner.nextInt());
        }

        int multiple = inputList.stream()
                .mapToInt(x -> x)
                .reduce(1, (a, b) -> a * b);
        
        if (multiple > (long)Math.pow(10, 18)) {
            System.out.println(-1);
        } else {
            System.out.println(multiple);
        }
    }
}
