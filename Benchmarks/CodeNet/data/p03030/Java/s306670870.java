import java.util.*;

class Main {
    public static void main(String[] args) {

        class Shop {
            String city;
            int score;
            int number;

            Shop(String city, int score, int number) {
                this.city = city;
                this.score = score;
                this.number = number;
            }
        }

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Shop> shops = new ArrayList<>();

        for (int i=0; i<N; i++) {
            shops.add(new Shop(sc.next(), sc.nextInt(), i+1));
        }

        Collections.sort(shops, (Shop s1, Shop s2) -> s1.city.compareTo(s2.city));

        String city = shops.get(0).city;
        ArrayList<Shop> shopsInSameCity = new ArrayList<>();

        for (int i=0; i<N; i++) {
            if (city.equals(shops.get(i).city)) {
                shopsInSameCity.add(shops.get(i));
            } else {
                Collections.sort(shopsInSameCity, (Shop s1, Shop s2) -> s2.score - s1.score);
                for (Shop s : shopsInSameCity) {
                    System.out.println(s.number);
                }

                shopsInSameCity = new ArrayList<>();
                city = shops.get(i).city;
                shopsInSameCity.add(shops.get(i));
            }
        }
        Collections.sort(shopsInSameCity, (Shop s1, Shop s2) -> s2.score - s1.score);
        for (Shop s : shopsInSameCity) {
            System.out.println(s.number);
        }
    }
}
