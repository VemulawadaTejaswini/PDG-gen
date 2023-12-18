

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class City implements Comparable<City>{
    int p;
    int y;
    String id;

    City(int p, int y) {
        this.p = p;
        this.y = y;
    }

	@Override
	public int compareTo(City o) {
		return this.y - o.y;
	}

    
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<Integer, ArrayList<City>> map = new HashMap<Integer, ArrayList<City>>();
        ArrayList<City> ansList = new ArrayList<City>();

        for (int i = 0; i < M; i++ ) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            City c = new City(p, y);
            map.putIfAbsent(p, new ArrayList<City>());
            map.get(p).add(c);
            ansList.add(c);
        }

        for (int i = 0; i <= N; i++ ) {
            if (map.containsKey(i)) {
                ArrayList<City> list = map.get(i);
                list.sort(Comparator.naturalOrder());
                for (int j = 0; j < list.size(); j++ ) {
                    list.get(j).id = String.format("%06d%06d", i, j + 1);
                }
            }
        }

        ansList.stream().forEach(c -> System.out.println(c.id));

        sc.close();
    }

}