import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        int n = 0;
        String line = null;
        boolean scansucceed = false;
        try (Scanner scanner = new Scanner(System.in)) {
            n = Integer.parseInt(scanner.nextLine());
            line = scanner.nextLine();
            scansucceed = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!scansucceed)
            System.exit(0);
        String[] linearray = line.split(" ");
        List<Integer> target = Arrays.stream(linearray).mapToInt(x -> -Integer.parseInt(x)).sorted().map(x -> -x)
                .boxed().collect(Collectors.toList());
        List<Integer> children = new LinkedList<>(target);
        List<Integer> slimes = new ArrayList<>();
        slimes.add(children.remove(0));
        boolean regenerable = true;
        outerloop: for (int generation = 0; generation < n; generation++) {
            Collections.sort(slimes, Comparator.reverseOrder());
            int numparents = (1 << generation);
            for (int i = 0; i < numparents; i++) {
                int parent = slimes.get(i); // 自分より小さいスライムのうち，最大のものを産む
                boolean birth = false;
                for (int j = 0; j < children.size(); j++) {
                    int child = children.get(j);
                    if (child < parent) {
                        children.remove(j);
                        birth = true;
                        slimes.add(child);
                        break;
                    }
                }
                regenerable &= birth;
                if (!regenerable) {
                    break outerloop;
                }
            }
        }
        System.out.println(regenerable ? "Yes" : "No");
    }
}