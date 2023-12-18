import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, Set<Integer>> map = new HashMap<>();
        int[] parr = new int[m];
        int[] yarr = new int[m];
        for(int i = 0; i < m;i++){
            int p = sc.nextInt();
            parr[i] = p;
            int y = sc.nextInt();
            yarr[i] = y;

            if(map.containsKey(p)){
                map.get(p).add(y);
            } else {
                Set<Integer> set = new TreeSet<>();
                set.add(y);
                map.put(p, set);
            }
        }

        Map<Integer, Map<Integer, Integer>> ansmap = new HashMap<>();
        for(int key : map.keySet()){
            Set<Integer> set = map.get(key);
            Integer[] arr = new Integer[set.size()];
            set.toArray(arr);
            Map<Integer, Integer> tmpmap = new HashMap<>();
            for(int i = 0; i < set.size();i++){
                tmpmap.put(arr[i], i+1);
            }
            ansmap.put(key, tmpmap);
        }

        for(int i = 0; i < m;i++){
            int index = ansmap.get(parr[i]).get(yarr[i]);
            System.out.printf("%06d%06d\n", parr[i], index);
        }
    }

}