import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        sc.close();

        Map<Integer, Integer> countMap = new HashMap<>();

        for (String val : arr) {
            Integer count = countMap.get(Integer.parseInt(val));
            if (Objects.isNull(count)) {
                countMap.put(Integer.parseInt(val), 0);
            }else{
            countMap.put(Integer.parseInt(val), count++);
            }
        }

        if (countMap.size() == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}