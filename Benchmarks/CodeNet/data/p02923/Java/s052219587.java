import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args) {
        final Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        String h = scanner.nextLine();

        String[] strArray = h.split(" ");
        List<Integer> hList = strArrayToIntList(strArray);

        List<Integer> countList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < hList.size() - 1; i++) {
            if (hList.get(i) >= hList.get(i+1)) {
                count++;
                if (i == (hList.size() - 2)) {
                    countList.add(count);
                }
            } else {
                countList.add(count);
                count = 0;
            }
        }
        Integer result = Collections.max(countList);
        System.out.println(result);
    }

    private static List<Integer> strArrayToIntList(String[] strArray) {
        List<Integer> intList =
                Arrays
                    .stream(strArray)
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());;
        return intList;
    }
}