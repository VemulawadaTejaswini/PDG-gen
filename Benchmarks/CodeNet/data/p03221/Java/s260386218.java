import java.util.*;
import java.util.stream.*;
import java.util.function.*;

// 市 i が 県 Pi に属する市の中で x 番目に誕生した市のとき、市 i の認識番号の上 6 桁は Pi、下 6 桁は x となります。
// ただし、Pi や x が 6 桁に満たない場合は 6 桁になるまで 0 を左に追加するものとします。


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 県数
        int m = sc.nextInt();// 市数計
        int[] p = new int[m];// 県番号
        int[] y = new int[m];
        // long[] r = new long[m];
        // List<City> cities = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++) {
            // cities.add(new City(sc.nextInt(), 0, sc.nextInt()));
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
            map.put(y[i], p[i]);
        }
        Map<Integer, List<Integer>> cityYearsMap =
            map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(e -> e.getValue(), Collectors.mapping(e -> e.getKey(), Collectors.toList())));
        cityYearsMap.entrySet()
                    .forEach(e -> e.getValue().sort(null));
        
        for(int i = 0; i < m; i++) {
            int nth = cityYearsMap.get(p[i]).indexOf(y[i]) + 1;
            System.out.printf("%06d%06d%n", p[i], nth);
        }
        
        // Map<Integer, List<City>> citiesMap =
        //     cities.stream()
        //         .collect(Collectors.groupingBy(c -> c.p));
        
        
    }
}

// class City {
//     int p;
//     int n;
//     int y;
//     public City(int p, int n, int y) {
//         this.p = p;
//         this.n = n;
//         this.y = y;
//     }
// }

