import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> ss = Stream.of(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        if (n != ss.size()) {
            return;
        }
        int q = Integer.parseInt(sc.nextLine());
        List<Integer> ts = Stream.of(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        if (q != ts.size()) {
            return;
        }
        int c = (int)ts.stream()
                .filter(t -> Main.binarySearch(ss, t))
                .count();
        System.out.println(c);
    }

    public static boolean binarySearch(List<Integer> ss, Integer target) {
        int left = 0;
        int right = ss.size() - 1;
        while(left < right)  {
            int mid = (left + right) / 2;
            int s = ss.get(mid);
            if (s == target) {
                return true;
            } else if (s > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}


