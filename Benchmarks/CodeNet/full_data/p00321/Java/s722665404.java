import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int F = sc.nextInt();
            Map<String, Map<String, Integer>> cntMap = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int M = sc.nextInt();
                List<String> itemList = new ArrayList<>();
                for (int j = 0; j < M; j++) {
                    itemList.add(sc.next());
                }

                Collections.sort(itemList);

                for (int j = 0; j < itemList.size(); j++) {
                    for (int k = j + 1; k < itemList.size(); k++) {
                        String from = itemList.get(j);
                        String to = itemList.get(k);
                        Map<String, Integer> map = cntMap.getOrDefault(from, new HashMap<>());

                        int cnt = map.getOrDefault(to, 0);
                        cnt++;

                        map.put(to, cnt);
                        cntMap.put(from, map);
                    }
                }
            }

            List<String> fromList = new ArrayList<>();
            List<String> toList = new ArrayList<>();

            cntMap.keySet().stream().sorted().forEach(from -> {
                Map<String, Integer> map = cntMap.get(from);
                map.keySet().stream().sorted().forEach(to -> {
                    if ( map.get(to) >= F ) {
                        fromList.add(from);
                        toList.add(to);
                    }
                });
            });

            System.out.println(fromList.size());
            for (int i = 0; i < fromList.size(); i++) {
                System.out.println(fromList.get(i) + " " + toList.get(i));
            }
        }
    }
}

