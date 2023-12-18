import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int input = scanner.nextInt();

        List<Long> arr = new ArrayList<>();
        for (long i = 0; i < number; i++) {
            arr.add(scanner.nextLong());
        }

        List<Long> arr2 = new ArrayList<>();
        for (int j = 0; j < arr.size(); j++) {
            for (int k = j + 1; k < arr.size(); k++) {
                arr2.add(arr.get(j) * arr.get(k));
            }
        }
        arr2.sort(Comparator.naturalOrder());
        System.out.println(arr2.get(input - 1));
    }
}