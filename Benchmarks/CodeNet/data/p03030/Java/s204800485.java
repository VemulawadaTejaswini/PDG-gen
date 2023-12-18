import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = -1;
        int N;
        String line;
        List<Restaurant> rList = new ArrayList<Restaurant>();
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.equals("")) break;
            if (++count == 0) {
                N = Integer.parseInt(line);
            } else {
                String[] lineArr = line.split(" ");
                rList.add(restaurantFactory(count, lineArr[0], Integer.parseInt(lineArr[1])));
            }
        }

        Collections.sort(rList, new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant o1, Restaurant o2) {
                if (!o1.city.equals(o2.city)) return o1.city.compareTo(o2.city);

                return (-1) * o1.score.compareTo(o2.score);
            }
        });

        for (Restaurant r: rList) {
            System.out.println(r.index);
        }
    }

    private static Restaurant restaurantFactory(Integer index, String city, Integer score) {
        Restaurant r = new Restaurant();
        r.index = index;
        r.city = city;
        r.score = score;
        return r;
    }

    private static class Restaurant {
        Integer index;
        String city;
        Integer score;
    }
}
