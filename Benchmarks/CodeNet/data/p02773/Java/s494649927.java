import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(array[i])){
                int value = map.get(array[i]);
                map.put(array[i], ++value);
            } else {
                map.put(array[i], 1);
            }
        }

        int max = Collections.max(map.values());

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            if (map.get(array[i]) == max){
                list.add(array[i]);
            }
        }

        Collections.sort(list);

        List<String> list2 = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            if (list2.contains(list.get(i))){
            } else {
                System.out.println(list.get(i));
                list2.add(list.get(i));
            }
        }
    }
}
