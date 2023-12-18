import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            stringList.add(sc.next());
        }
        Collections.sort(stringList);

        HashSet<String> stringSet = new HashSet<String>();

        int maxDupCount = 0;
        int currentDupCount = 0;
        HashSet<String> resultSet = new HashSet<>();
        for (String element : stringList) {
            boolean isAdded = stringSet.add(element);

            if (isAdded) {
                currentDupCount = 1;
            } else {
                currentDupCount++;
            }

            if (currentDupCount > maxDupCount) {
                maxDupCount = currentDupCount;

                if (isAdded) {
                    resultSet.clear();
                }
            }

            resultSet.add(element);
        }

        resultSet.stream().forEach(System.out::println);
    }
}
