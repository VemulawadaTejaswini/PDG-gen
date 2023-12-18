import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int lowElements(List<Integer> nums) {
        Set<Integer> available = new HashSet<>();
        Set<Integer> failed = new HashSet<>();

        for (int i = 0; i < nums.size(); i++) {
            available.add(i);
        }

        for (int j = 0; j < nums.size(); j++) {
            final int _j = j;
            Set<Integer> failedCurrent = available.stream()
                    .filter(i -> i >= _j)
                    .filter(i -> nums.get(i) > nums.get(_j))
                    .peek(failed::add)
                    .collect(Collectors.toSet());
            failedCurrent.forEach(available::remove);
        }

        return nums.size() - failed.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println(lowElements(nums));
    }

}
