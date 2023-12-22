import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            list.add(x);
            list.add(y);
            for (int j = 0; j < lists.size(); j++) {
                List<Integer> node = lists.get(j);
                max = Math.abs(x - node.get(0)) + Math.abs(y - node.get(1));
            }
            lists.add(list);
        }

        for (int i = 2; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int curMax = 0;
            int index = 0;
                for (int j = 0; j < lists.size(); j++) {
                    List<Integer> node = lists.get(j);
                    int d = Math.abs(x - node.get(0)) + Math.abs(y - node.get(1));
                    if (d > curMax) {
                        curMax = d;
                        index = j;
                    }
                }
            if (curMax > max) {
                max = curMax;
                List<Integer> list1 = new ArrayList<>();
                list1.add(x);
                list1.add(y);
                List<Integer> list2 = new ArrayList<>();
                List<Integer> node = lists.get(index);
                list2.add(node.get(0));
                list2.add(node.get(1));
                lists.clear();
                lists.add(list1);
                lists.add(list2);
            }
        }
        System.out.println(max);
	}
}