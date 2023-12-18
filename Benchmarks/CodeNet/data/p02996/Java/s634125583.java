import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (map.containsKey(B)) {
                List<Integer> list = map.get(B);
                list.add(A);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(A);
                map.put(B, list);
            }
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        long count = 0;
        for (Integer key : keySet) {
            for (Integer task : map.get(key)) {
                count += task;
                if (key < count) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }    
}
