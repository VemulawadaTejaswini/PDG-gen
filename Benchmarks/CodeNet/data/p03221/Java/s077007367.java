import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        Map<Integer, List<Integer>> prefs = new HashMap<>();
        Map<Integer, Integer> yearToPref = new HashMap<>();
        List<Integer> cities = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int pref = Integer.parseInt(sc.next());
            int year = Integer.parseInt(sc.next());

            cities.add(year);
            yearToPref.put(year, pref);

            if (prefs.containsKey(pref)) {
                prefs.get(pref).add(year);
            } else {
                prefs.put(pref, new ArrayList<>(Arrays.asList(year)));
            }
        }

        prefs.forEach((pref, years) -> Collections.sort(years));

        cities.forEach(city ->
            System.out.println(
                    String.format("%06d%06d",
                            yearToPref.get(city),
                            prefs.get(yearToPref.get(city)).indexOf(city) + 1
                    ))
        );

    }
}