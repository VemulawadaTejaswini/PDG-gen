
import java.util.*;

/**
 * @author Administrator
 * @date 2017/9/12
 */
public class Main {

    static class Node {
        int val;
        int num = 0;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        Map map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        HashSet<Object> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        if (set.size() <= k) {
            System.out.println(0);
            return;
        }
        Node[] nodes = new Node[set.size()];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                nodes[count] = new Node();
                nodes[count].setVal(arr[i]);
                nodes[count].setNum(nodes[count].getNum() + 1);
            } else if (arr[i] == arr[i - 1]) {
                nodes[count].setNum(nodes[count].getNum() + 1);
            } else if (arr[i] != arr[i - 1]) {
                count += 1;
                nodes[count] = new Node();
                nodes[count].setVal(arr[i]);
                nodes[count].setNum(nodes[count].getNum() + 1);
            }
        }
        Arrays.sort(nodes, new Comparator<Node>() {

            @Override
            public int compare(Node o1, Node o2) {
                return o1.getNum() - o2.getNum();
            }
        });
        int sum = 0;
        for (int i = 0; i < set.size() - k; i++) {
            sum += nodes[i].num;
        }
        System.out.println(sum);
    }
}
