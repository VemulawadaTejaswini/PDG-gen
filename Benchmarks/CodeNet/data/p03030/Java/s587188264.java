import javax.crypto.Cipher;
import java.util.*;

public class Main{
    public static void main(String args[]){
        List<City> cityList = new ArrayList<>();

        List<City> cityList2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try{
            int n = scanner.nextInt();
            for(int i = 0;i<n;i++) {
                String city = scanner.next();
                int score = scanner.nextInt();
                cityList.add(new City(city,score));
                cityList2.add(new City(city,score));
            }
            cityList.sort(new CityComparater());
        for(int i = 0 ; i<n; i++){
            System.out.println(cityList2.indexOf(cityList.get(i))+1);
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}

class CityComparater implements Comparator<City>{
    @Override
    public int compare(City city1,City city2){
        if(city1.name.compareTo(city2.name)==0) return city1.score > city2.score ? -1:1;
        return city1.name.compareTo(city2.name);
    }
}
class City{
    String name;
    int score;
    City(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return score == city.score &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
