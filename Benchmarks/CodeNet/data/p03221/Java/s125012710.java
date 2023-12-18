import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<City> citys = new ArrayList<>();
        int[] cityInPre = new int[n + 1];
        Arrays.fill(cityInPre, 0);
        for (int i = 0; i < m; i++) {
            City city = new City(i, sc.nextInt(), sc.nextInt());
            citys.add(city);
        }

        citys.sort((a, b) -> a.year - b.year);
        for (int i = 0; i < citys.size(); i++) {
            citys.get(i).number = cityInPre[citys.get(i).pref] + 1;
            cityInPre[citys.get(i).pref]++;
        }
        citys.sort((a, b) -> a.order - b.order);
        for (int i = 0; i < citys.size(); i++) {
            String s = "";
            for (int j = 0; j < 5 - Math.floor(Math.log10(citys.get(i).pref)); j++) {
                s = s + "0";
            }
            s = s + Integer.toString(citys.get(i).pref);
            for (int j = 0; j < 5 - Math.floor(Math.log10(citys.get(i).number)); j++) {
                s = s + "0";

            }
            s = s + Integer.toString(citys.get(i).number);
            System.out.println(s);
        }
    }

}

class City {
    int order;
    int pref;
    int year;
    int number;

    City(int order, int pref, int year) {
        this.order = order;
        this.pref = pref;
        this.year = year;
    }
}