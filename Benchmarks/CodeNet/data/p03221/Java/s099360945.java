import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static class Item
            implements Comparable {
        int prefecture;
        int year;
        int order;

        Item(int prefecture, int year)
        {
            this.prefecture = prefecture;
            this.year = year;
        }

        @Override
        public int compareTo(Object o)
        {
            return year - ((Item)o).year;
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, List<Item>> map = new HashMap<>(n);
        List<Item> list = new ArrayList<>(m);

        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt();
            int y = scanner.nextInt();
            if (!map.containsKey(p)) {
                map.put(p, new ArrayList<>());
            }
            List<Item> itemList = map.get(p);
            Item item = new Item(p, y);
            itemList.add(item);
            list.add(item);
        }

        for (List<Item> xs : map.values()) {
            Collections.sort(xs);
            for (int i = 0; i < xs.size(); i++) {
                xs.get(i).order = i;
            }
        }

        for (Item yp : list) {
            System.out.println(String.format("%06d%06d", yp.prefecture, yp.order + 1));
        }
    }
}
