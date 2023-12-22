import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n, m;
            while((n = scn.nextInt()) > 0 | (m = scn.nextInt()) > 0) {
                HashMap<Integer, Integer> locations = new HashMap<>();
                for(int i = 0; i < m; i++) {
                    locations.put(-~i, 0);
                }

                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < m; j++) {
                        if(scn.nextInt() > 0) {
                            locations.put(-~j, -~locations.get(-~j));
                        }
                    }
                }

                ArrayList<Entry<Integer, Integer>> list = new ArrayList<>(locations.entrySet());
                Collections.sort(list, new LocationComparator());

                StringBuilder sb = new StringBuilder();
                for(Entry<Integer, Integer> entry : list) {
                    sb.append(entry.getKey() + " ");
                }
                System.out.println(sb.toString().trim());
            }
        }
    }
}

class LocationComparator implements Comparator<Entry<Integer, Integer>> {
    @Override
    public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}