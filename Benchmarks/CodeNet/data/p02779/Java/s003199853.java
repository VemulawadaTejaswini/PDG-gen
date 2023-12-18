import java.util.*;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        List<Integer> nums = Arrays.stream(sc.nextLine().split(" ")).map(Integer::valueOf).collect(toList());
        Set<Integer> visited = new HashSet<>(nums.size());

        for (Integer i : nums) {
            if (visited.contains(i)) {
                System.out.println("NO");
                return;
            } else {
                visited.add(i);
            }
        }

        System.out.println("YES");
    }
}