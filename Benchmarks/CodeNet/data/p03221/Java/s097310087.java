import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        Map<Integer, List<Integer>> prefs = new HashMap<>();
        Map<Integer, Integer> yearToPref = new HashMap<>();
        int[] cities = new int[m];

        for (int i = 0; i < m; i++) {
            int pref = Integer.parseInt(sc.next());
            int year = Integer.parseInt(sc.next());

            cities[i] = year;
            yearToPref.put(year, pref);

            if (prefs.containsKey(pref)) {
                prefs.get(pref).add(year);
            } else {
                prefs.put(pref, new ArrayList<>(Arrays.asList(year)));
            }
        }

        prefs.forEach((pref, years) -> Collections.sort(years));

        Arrays.stream(cities).forEach(year ->
            System.out.println(
                    String.format("%06d%06d",
                            yearToPref.get(year),
                            prefs.get(yearToPref.get(year)).indexOf(year) + 1
                    ))
        );
    }
}