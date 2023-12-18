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

        Map<Integer, Map<Integer, String>> ansmap = new HashMap<>();
        for(int key : map.keySet()){
            Set<Integer> set = map.get(key);
            Map<Integer, String> tmpmap = new HashMap<>();
            int index = 1;
            String pre = String.format("%06d",key);
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                tmpmap.put(it.next(), pre + String.format("%06d",index++));
            }
            ansmap.put(key, tmpmap);
        }

        for(int i = 0; i < m;i++){
            System.out.println(ansmap.get(parr[i]).get(yarr[i]));
        }
    }

}