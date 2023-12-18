import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLong());
        }
        List<Long> productList = new ArrayList<>();
        for(int i = 0; i < list.size() - 1; i++) {
            long base = list.get(i);
            for (int j = i + 1; j< list.size(); j++) {
                productList.add(base * list.get(j));
            }
        }
        Collections.sort(productList);

        System.out.println(productList.get(k - 1));
    }
}
