import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.nextLine();
        List<Integer> aList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        AtomicBoolean bool = new AtomicBoolean(false);
        aList.forEach(a -> {
            if(a % 2 == 0) {
                if(a % 3 != 0 && a % 5 != 0) {
                    System.out.println("DENIED");
                    System.exit(0);
                }
            }
        });
        System.out.println("APPROVED");
    }
}
