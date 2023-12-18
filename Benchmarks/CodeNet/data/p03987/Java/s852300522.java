
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    static class Node {
        int value;
        int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Node{" +
                   "value=" + value +
                   ", index=" + index +
                   '}';
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Node> value = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Node node = new Node(scanner.nextInt(), i);
            value.add(node);
        }
        Collections.sort(value, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.value - o2.value;
            }
        });
        TreeSet<Node> set = new TreeSet<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.index - o2.index;
            }
        });
        BigDecimal r = new BigDecimal((n - value.get(0).index) * (value.get(0).index + 1));
        set.add(value.get(0));

        for (int i = 2; i <= n; i++) {
            Node my = value.get(i - 1);
            set.add(my);
            int myIndex = my.index;
            int rightSmallIndex = n;
            int leftSmallIndex = -1;
            SortedSet<Node> headSet = set.headSet(my);
            Node left = headSet.isEmpty() ? null : headSet.last();
            SortedSet<Node> tailSet = set.tailSet(my);
            final Node right;
            if (tailSet.size() == 1) {
                right = null;
            } else {
                tailSet.remove(tailSet.first());
                right = tailSet.first();
            }
            if (left != null) {
                leftSmallIndex = left.index;
            }
            if (right != null) {
                rightSmallIndex = right.index;
            }

            BigDecimal current = new BigDecimal(i);
            int val = myIndex - leftSmallIndex;
            int val1 = rightSmallIndex - myIndex;
            BigDecimal multiply = current.multiply(new BigDecimal(val))
                                         .multiply(new BigDecimal(val1));
            r = r.add(multiply);

        }
        System.out.println(r);
    }
}
