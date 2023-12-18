import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int count = std.nextInt();
        List<Integer> values = IntStream.range(0, count).map(it -> std.nextInt()).boxed().collect(Collectors.toList());
//        Set<Integer> set = new TreeSet<>();
//        Deque<Integer> deque = new ArrayDeque<>();
        LinkedList<Integer> deque = new LinkedList<>();
        List<Integer> indexs = IntStream.range(0, count).boxed().collect(Collectors.toList());
        for (int i = 0; i < count; i++) {
            int value = values.get(i);
            indexs.set(value - 1, i);
        }
        long ans = 0;
        for (int x = count - 1; x >= 0; x--) {
            // x = value
            Integer index = indexs.get(x);


            int appearCount = 0;
//            Deque<Integer> lDeque = new ArrayDeque<>();
            int[] l = new int[2];
            Arrays.fill(l, -1);
            int[] r = new int[2];
            Arrays.fill(r, count);
//            Deque<Integer> rDeque = new ArrayDeque<>();
            {
                deque.add(index);
                Collections.sort(deque);
//                deque = deque.stream()
//                        .sorted()
//                        .collect(Collectors.toCollection(ArrayDeque::new));
                Collections.sort(deque);
                {
                    Iterator it = deque.descendingIterator();
                    while (true) {
                        if (!it.hasNext() || it.next() == index) break;
                    }
                    for (int j = 0; j < 2; j++) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Integer newIndex = (Integer) it.next();
                        l[j] = newIndex;
                    }
                }

                {
                    Iterator it = deque.iterator();
                    while (true) {
                        if (!it.hasNext() || it.next() == index) break;
                    }
                    for (int j = 0; j < 2; j++) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r[j] = (int) it.next();
                    }
                }

                int[] ls = new int[2];
                int[] rs = new int[2];

                ls[0] = index - l[0];
                ls[1] = l[0] - l[1];

                rs[0] = r[0] - index;
                rs[1] = r[1] - r[0];
                appearCount = ls[0] * rs[1] + rs[0] * ls[1];
            }

            ans += appearCount * (x + 1);

        }

        System.out.println(ans);
    }
}