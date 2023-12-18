import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Restaurant[] r = new Restaurant[n];
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int rank = sc.nextInt();
            r[i] = new Restaurant(name, rank, i);
        }
        Arrays.sort(r, new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant o1, Restaurant o2) {
                if(o1.name.compareTo(o2.name) != 0) {
                    return o1.name.compareTo(o2.name);
                } else {
                    return o2.rank - o1.rank;
                }
            }
        });
        for(int i = 0; i < n; i++) {
            System.out.println(r[i].index + 1);
        }
    }
}


class Restaurant {
    String name;
    int rank;
    int index;
    Restaurant(String name, int rank, int index) {
        this.name = name;
        this.rank = rank;
        this.index = index;
    }
}
