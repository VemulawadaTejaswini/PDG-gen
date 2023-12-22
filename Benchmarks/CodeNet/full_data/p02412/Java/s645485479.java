import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            List<Integer> n_x = Stream.of(sc.nextLine().split(" "))
                                      .map(Integer::parseInt)
                                      .collect(Collectors.toList());
            int n = n_x.get(0);
            int x = n_x.get(1);
            if (n_x.stream().allMatch(i -> i == 0)) {
                break;
            }
            int count = 0;
            List<String> cs = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (x <= i) {
                    continue;
                }
                for (int j = 1; j <= n; j++) {
                    if (j == i || x <= (i + j)) {
                        continue;
                    }
                    for (int k = 1; k <= n; k++) {
                        if (i == k || j == k || x <= (i + j + k)) {
                            continue;
                        }
                        String s = Stream.of(i, j, k)
                                         .sorted()
                                         .map(number -> number.toString())
                                         .collect(Collectors.joining(""));
                        if (cs.contains(s)) {
                            continue;
                        }
                        if (x == (i + j + k)) {
                            count++;
                            cs.add(s);
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}


