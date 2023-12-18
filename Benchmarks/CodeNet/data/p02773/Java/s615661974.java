import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        scan.nextLine();
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(scan.nextLine());
        }

        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(n2 -> n2,Collectors.counting()));

        Map<Long, List<String>> outMap = new HashMap<>();
        map.forEach((key,value) -> {
            List<String> sList = outMap.get(value);
            if(sList == null) {
                sList = new ArrayList<>();
                outMap.put(value,sList);
            }
            sList.add(key);
        });
        Object[] mapKey = outMap.keySet().toArray();
        Arrays.sort(mapKey, Collections.reverseOrder());

        outMap.get(mapKey[0]).stream().sorted().forEach(value -> {
            System.out.println(value);
        });
    }
}
