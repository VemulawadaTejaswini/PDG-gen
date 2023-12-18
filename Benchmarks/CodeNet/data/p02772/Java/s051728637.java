import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            intList.add(sc.nextInt());
        }

        List<Integer> filteredList = intList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

        int resultCount = (int)filteredList.stream().filter(e -> (e % 3 == 0) || (e % 5 == 0)).count();

        System.out.println(resultCount == filteredList.size() ? "APPROVED": "DENIED");
    }
}
