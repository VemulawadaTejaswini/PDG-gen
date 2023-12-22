import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxX = 0, maxY = 0, minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxXIndex = 0, maxYIndex = 0, minXIndex = 0, minYIndex = 0;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > maxX) {
                maxX = x;
                maxXIndex = i;
            }
            if (x < minX) {
                minX = x;
                minXIndex = i;
            }
            if (y > maxY) {
                maxY = y;
                maxYIndex = i;
            }
            if (y < minY) {
                minY = y;
                minYIndex = i;
            }
            List<Integer> list = new ArrayList<>();
            list.add(x);
            list.add(y);
            lists.add(list);
        }
        List<List<Integer>> compareLists = new ArrayList<>();
        int max = 0;
        compareLists.add(lists.get(maxXIndex));
        compareLists.add(lists.get(minXIndex));
        compareLists.add(lists.get(maxYIndex));
        compareLists.add(lists.get(minYIndex));
        for (int i = 0; i < compareLists.size(); i++) {
            List<Integer> node1 = compareLists.get(i);
            for (int j = i + 1; j < compareLists.size(); j++) {
                List<Integer> node2 = compareLists.get(j);
                max = Math.max(max, Math.abs(node1.get(0) - node2.get(0)) + Math.abs(node1.get(1) - node2.get(1)));
            }
        }
        System.out.println(max);
	}
}