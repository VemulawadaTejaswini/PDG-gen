import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, ArrayList<int[]>> map = new HashMap<>();
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            set.add(s);
            int p = sc.nextInt();
            if(!map.containsKey(s)) map.put(s, new ArrayList<>());
            map.get(s).add(new int[]{p, i+1});
        }
        for(String name : set){
            ArrayList<int[]> list = map.get(name);
            Collections.sort(list, (x, y) -> Integer.compare(y[0], x[0]));
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i)[1]);
            }
        }
        sc.close();

    }

}
