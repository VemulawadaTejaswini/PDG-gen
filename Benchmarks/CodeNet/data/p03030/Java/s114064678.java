import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<City> cities = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            City city = new City(i, sc.next(), sc.nextInt());

            int index = cities.indexOf(city);
            if (index == -1) {
                cities.add(city);
            } else {
                cities.get(index).addRestaurant(i, city.ids.get(0).point);
            }
        }

        cities.sort(Comparator.comparing(aCity -> aCity.name));

        for (City city: cities
             ) {
            city.ids.sort((aID, bID) -> bID.point - aID.point);
            for(ID id : city.ids) {
                // 出力
                System.out.println(id.no);
            }
        }
    }

    private static class City {
        private ArrayList<ID> ids = new ArrayList<>();
        private String name;

        private City(int no, String name, int point) {
            addRestaurant(no, point);
            this.name = name;
        }

        private void addRestaurant(int no, int point) {
            ids.add(new ID(no, point));
        }

        @Override
        public boolean equals(Object obj) {
            City target = (City)obj;
            return name.equals(target.name);
        }
    }

    private static class ID {
        private int no;
        private int point;
        private ID(int no, int point) {
            this.no = no;
            this.point = point;
        }
    }
}