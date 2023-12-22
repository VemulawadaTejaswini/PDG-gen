import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            list.add(x);
            list.add(y);
            for (int j = 0; j < lists.size(); j++) {
                List<Integer> node = lists.get(j);
                max = Math.max(max,Math.abs(x - node.get(0)) + Math.abs(y - node.get(1)));
            }
            lists.add(list);
        }
        System.out.println(max);
	}
}